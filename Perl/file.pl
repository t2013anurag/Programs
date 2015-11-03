open INPUT,"<sample.txt";
while(<INPUT>)
{
print;
}
close (INPUT);
open INPUT,"<sample.txt";
$ct = <INPUT>;
$ct = <INPUT>;
print 'Second Line: ',$ct;
close(INPUT);
open INPUT,"<sample.txt";
@a=(INPUT);
chomp(@a);
print "Content transferred to an array";
close(INPUT);
print @a;
print "\n Enter name and age";
$n = <>;
chomp($n);
$a = <>;
chomp($a);
open OUTPUT,">>sample.txt";
print OUTPUT $n.$a;
close(OUTPUT);
print "\nInformation Transferred";
