function solution(N) {
  let str = '';
 
  if (N == 0) {
    return 0
  }

  for(i = 1; i <= N; i++) {
    str += i.toString()
  }

  return str.match(/1/g).length
}
