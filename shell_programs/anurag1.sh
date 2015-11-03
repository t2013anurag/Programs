#!/bin/sh
echo "enter two numbers"
read a b
read c
case $c in
1) s=`expr $a + $b`
echo $s;;
2) s=`expr $a - $b`
echo $s;;
3) s=`expr $a \* $b`
echo $s;;
4) s=`expr $a / $b`
echo $s;;
*) echo "INVALID NUMBER!" ;;
esac

