echo "Enter a and b"
read a b
a=`expr $a + $b`
b=`expr $a - $b`
a=`expr $a - $b`
echo "$a"
echo "$b" 
