echo "Enter a"
read a
echo "Enter b"
read b
echo "Enter c"
read c
if [ $a -gt $b ] && [ $a -gt $c ]
then
echo "a is greatest"
elif [ $b -gt $a ] && [ $b -gt $c ]
then
echo "b is greatest"
else
echo " c is greatest"
fi
