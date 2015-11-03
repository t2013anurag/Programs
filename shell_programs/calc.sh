echo "Enter two numbers"
read a b
echo "Enter your choice : 1. Addition.  2. Subtraction  3. Multiplication  4. Division"
read ch
case $ch in
1) s=`expr $a + $b`
echo "$s";;
2) s=`expr $a - $b`
echo "$s";;
3) s=`expr $a \* $b`
echo "$s";;
4) s=`expr $a / $b`
echo "$s";;
*) echo "INVALID NUMBER!" ;;
esac
