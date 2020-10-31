import os

class CaesarCipher:
    
    text = ""
    key = []
    
    def read_text(self, filename):
        file = open(filename, 'r')
        content = file.read()
        self.text = content
    
    def read_key(self, filename):
        file = open(filename, 'r')
        content = file.read()
        self.key = content.split()
        
    def encrypt(self, shift):
        result = []
  
        for i in range(0, len(self.text)):
            position = ord(self.text[i])%32
            result.append(self.key[(shift + position) % 26])
        
        result = "".join(result)
        
        return result 
    
def main():
    curr_dir = os.getcwd()
    
    Cypher = CaesarCipher()
    Cypher.read_text(curr_dir + "\message.txt")
    Cypher.read_key(curr_dir + "\key.txt")
    print("Enter shift value: ")
    shift = input()
    print("Original Message: " + Cypher.text)
    print("Encrypted Message: " + Cypher.encrypt(int(shift)))

if __name__ == "__main__":   
    main()
