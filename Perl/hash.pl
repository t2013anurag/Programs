%a = ('Anurag'=>19, 'Amit'=>21);
print %a;
print "\n";
print "Amit is $a{'Amit'} years old";
print "\n";
if(exists($a{'Anurag'})){
print "Anurag is $a{'Anurag'} years old";
print "\n";
}
delete($a{'Amit'});
print %a;
print "\n";
$a{'Ram'} = 19;
print %a;
print "\n";
