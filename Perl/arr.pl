@a = (1,2,45,88,4);
print @a;
print "\n";
push(@a,67);
pop();
print @a;
print "\n";
unshift(@a,78);
shift();
print @a;
print "\n";
delete @a[2];
print @a;
print "\n";