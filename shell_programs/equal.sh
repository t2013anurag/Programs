echo "enter a,b,c"
read a b c
echo "$a"
echo "$b"
echo "$c"
if [ $a -gt $b ] && [ $a -gt $c ]
then
echo "A is largest"
elif [ $b -gt $a ] && [ $b -gt $c ]
then
echo "B is largest"
else
echo "C is largest"
fi
