<html>
<body>
<?php
if(isset($_POST['submit'])){
	$con = mysql_connect("localhost","root","null")or die("Couldn't connect");
	mysql_select_db("anurag");
	echo "Connected";
	$student_id = $_POST['id'];
	$name = $_POST['name'];
	$major = $_POST['major'];
	$total = $_POST['total'];
	$grade = $_POST['grade'];
	$sql = "INSERT into student values('".$student_id."','".$name."','".$major."','".$total."','".$grade."')";
	$res= mysql_query($sql);
	if($res)
		echo "Inserted";
	else
		echo "Not Inserted";
	$q = "SELECT * from student where grade = 'A'";
	$r = mysql_query($q);
	if($r)
	{
		while($row = mysql_fetch_array($r))
		{
			echo "<table><tr><td>";
			echo $row{'student_id'};echo "</td><td>";
			echo $row{'name'};echo "</td><td>";
			echo $row{'major'};echo "</td><td>";
			echo $row{'total'};echo "</td><td>";
			echo $row{'grade'};echo "</td>";
			echo "</table>";	
		}
	}
	else
		echo "Not executed";
}
?>
<form action="in.php" method="POST">
Student Id <input type= "text" name ="id">
Name <input type= "text" name ="name">
Major <input type= "text" name ="major">
Total <input type= "text" name ="total">
Grade <input type= "text" name ="grade">
<input type="submit" value="Submit" name="submit">
</form>
</body>
</html>
