<html>
<body>
<?php
if(isset($_GET['s']))
{
$ch=$_GET['choice'];
$c=$_GET['con'];
switch($ch)
{
case 1:$fp=fopen("new.txt","r");
		while(!feof($fp))
		{
		echo fgetc($fp);
		}
		break;
case 2:$fp=fopen("new.txt","w");
		fwrite($fp,$c);
		break;
case 3:$fp=fopen("new.txt","a");
		fwrite($fp,$c);
		break;
 
}
}
?>
<form action =''>
select your option:
<br>
<input type="radio" value="1" name="choice">Read
<input type="radio" value="2" name="choice">Write
<input type="radio" value="3" name="choice">Append
<br>
Enter the contents for read or write mode:
<textarea name="con"></textarea>
<br>
<input type="submit" name="s" value="submit">
</form>
</body>
</html>
