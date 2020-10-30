A_cnt := 0
T_cnt := 0
G_cnt := 0
C_cnt := 0
for i from 1 to length of S do
    if S[i] = 'A' then A_cnt := A_cnt + 1
    if S[i] = 'T' then T_cnt := T_cnt + 1
    if S[i] = 'G' then G_cnt := G_cnt + 1
    if S[i] = 'C' then C_cnt := C_cnt + 1
end do
