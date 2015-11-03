<?php
$str = 'Hello World';
for($i = 0; $i< strlen($str); $i++)
{
$s = substr($str,$i,1);
if($s == 'a' || $s == 'e' || $s == 'i' || $s == 'o' || $s == 'u' || $s == 'A' || $s == 'E' || $s == 'I' || $s == 'O' || $s == 'U')
echo $s." postion:".$i;
}
echo "Occurences of a patter in a string: ";
echo substr_count($str, "ll");
$a = explode(" ",$str);

foreach($a as $k=>$v)
{
$v = strrev($v);
$l = strlen($v);
$v = str_pad($v,$l+2,"a",STR_PAD_BOTH);
echo $v;
}

echo "Replace with  a particular pattern";
echo substr_replace($str, "WORLD", 6,5);
?>
