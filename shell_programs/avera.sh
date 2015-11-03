echo "Enter marks of 3 subjects"
read a b c
f=`expr $a + $b + $c`
echo "Total marks are $f"
avg=`expr $f / 3`
echo "Average is $avg" 
