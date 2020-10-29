#include <iostream> 
#include <string> 
#include <type_traits> 
//Made by   @xcruzhd2 (telegram)
 
namespace string 
{ 
namespace helpers 
{ 
template <bool Condition, bool... Conditions> 
constexpr std::enable_if_t<sizeof...(Conditions) == 0, bool> any() 
{ 
    return Condition; 
} 
 
template <bool Condition, bool... Conditions> 
constexpr std::enable_if_t<(sizeof...(Conditions) > 0), bool> any() 
{ 
    return Condition ? true : any<Conditions...>(); 
} 
 
template <typename T, typename... Ts> 
struct IsOneOf 
{ 
    static const bool value = any<std::is_same<T, Ts>::value...>(); 
}; 
 
struct Printer 
{ 
    static void print(std::basic_string<char> const &t_string) 
    { 
        std::cout << t_string; 
    } 
 
    static void print(std::basic_string<wchar_t> const &t_string) 
    { 
        std::wcout << t_string; 
    } 
 
    template <typename T> 
    struct CheckIsAcceptedCharacterType 
    { 
        static_assert(IsOneOf<T, char, wchar_t>::value, 
                      "Type is not acceptable character type"); 
    }; 
}; 
 
}  
 
template <typename Expression_t> 
class StringExpression 
{ 
   public: 
    void print() const { static_cast<Expression_t *>(this)->print(); } 
}; 
 
template <typename Character_t = char, typename Printer_t = helpers::Printer> 
class String final 
  : public StringExpression<String<Character_t>>, 
    private Printer_t::template CheckIsAcceptedCharacterType<Character_t> 
{ 
   public: 
    using data_t = std::basic_string<Character_t>; 
 
   public: 
    explicit String(data_t t_data) : m_data{std::move(t_data)} {} 
    void print() const { Printer_t::print(m_data); } 
   private: 
    data_t m_data; 
}; 
 
template <typename L, typename R> 
class StringConcatenation final 
  : public StringExpression<StringConcatenation<L, R>> 
{ 
   public: 
    StringConcatenation(L const &t_left, R const &t_right) 
        : m_left{t_left}, m_right{t_right} 
    { 
    } 
     
    StringConcatenation(StringConcatenation &&) = default; 
    StringConcatenation& operator=(StringConcatenation &&) = delete; 
    StringConcatenation(StringConcatenation const &) = delete; 
    StringConcatenation& operator=(StringConcatenation const &) = delete; 
 
    void print() const 
    { 
        m_left.print(); 
        m_right.print(); 
    } 
 
   private: 
    L const &m_left; 
    R const &m_right; 
}; 
 
template <typename L, typename R> 
auto const operator+(L const &t_left, R const &t_right) 
{ 
    return StringConcatenation<L, R>{t_left, t_right}; 
} 
 
using wString_t = String<wchar_t>; 
using string_t = String<char>; 
 
}  
 
int main() 
{ 
    using string::wString_t; 
    using string::string_t; 
 
    string_t x{"HELLO"}; 
    string_t c{" "}; 
    wString_t ru{L"WORLD"}; 
    wString_t z{L"!"}; 
 
    (x+ c+ ru +z).print(); 
} 