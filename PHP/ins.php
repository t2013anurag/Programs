
<html>
<?php
if(isset($_POST['submit'])){
	$con = mysql_connect("localhost","root","null")or die("Could not connect");
	$db = "anurag";
	
	mysql_select_db($db);
	echo "connected";
	$student_id = $_POST['stuid'];
	$name = $_POST['name'];
	$major = $_POST['major'];
	$total = $_POST['total'];
	$grade = $_POST['grade'];
	
	$sql = "INSERT into student values ('".$student_id."','".$name."','".$major."','".$total."','".$grade."')";
	//$sql = "INSERT INTO student values(10,'Anuragt','IT',890,'S')";
	$m = mysql_query($sql, $con);	
	if($m)
		echo "Inserted";
	else
		echo "Not Inserted";

	$que = "SELECT * from student where total > 500";
	$res = mysql_query($que,$con);
	if($res)
	{
		while ($row = mysql_fetch_array($res)) {
			echo "<table><tr><td>";
			echo $row{'student_id'};echo"</td><td>";
			echo $row{'name'};echo"</td><td>";
			echo $row{'major'};echo"</td><td>";
			echo $row{'total'};echo"</td><td>";
			echo $row{'grade'};echo"</td>";
			echo "<table>";
			
		}
	}
	else {
		echo "string";
	}
	mysql_close($con);
}
?>
<body>
	<form action="ins.php" method="POST">
		Student Id: <input type="text" id="stuid" name="stuid">
		Name: <input type="text" id="name" name="name">
		Major: <input type="text" id="major" name="major">
		Total: <input type="text" id="total" name="total">
		Grade: <input type="text" id="grade" name="grade">
		<input type="submit" value="Submit" name="submit">
	</form>
</body>
</html>
