<?php
echo "//insertion sortn";
$data=array(6,5,3,1,8,7,2,4);
function insertion_sort($data){
  $n=count($data);
  for ($i = 1;$i<$n;$i++){ for ($k = $i; $k>0; $k--) {
      if($data[$k]<$data[$k-1]){
        $dummy=$data[$k];
        $data[$k]=$data[$k-1];
        $data[$k-1]=$dummy;
      }
    }
  }
  return $data;
}
print_r(insertion_sort($data));
?>