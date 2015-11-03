Front Page.html
<!DOCTYPE html>
<html>
<body>
<a href="insertimgdata.html">Insert Your Data </a><br>
<a href="viewall.php">View All Members </a><br>
</body>
<html>
insertimgdata.html
<!DOCTYPE html>
<html>
<body>

<form action="insimg.php" method="post" enctype="multipart/form-data">
	<table>
    <tr>
    	<td>Please fill the below details</td>
    </tr>
    <tr>
	    	<td>ID  : </td>
	    	<td><input type="text" id="uid" name="uid"></td>
    </tr>
    <tr>
    	<td>Name  : </td>
    	<td><input type="text" id="uname" name="uname"></td>
    </tr>
    <tr>
    	<td>Address:</td>
    	<td><textarea name="address" id="address" rows="5" cols="40"></textarea></td>
    </tr>
    <tr>
    	<td>Educational Qualification: </td>
    	<td><input type="text" id="edu" name="edu"></td>

    </tr>
    <tr>
    	<td>CGPA : </td>
    	<td><input type="text" id="cgpa" name="cgpa"></td>
    </tr>
    <tr>
    	<td>Please Upload your photo:</td>
    	<td><input type="file" name="fileToUpload" id="fileToUpload"></td>
    </tr>
    <tr>
    <td>
    <td><input type="submit" value="Insert Data" name="submit"></td>
    </table>
</form>
</body>
</html>

insimg.php
<?php
$db = mysqli_connect("localhost","root","","mydb");
$target_dir = "uploads/";

echo "File Name".$_FILES["fileToUpload"]["name"]. "<br>";
$target_file = $target_dir . $_FILES["fileToUpload"]["name"];

$uploadOk = 1;
$imageFileType = pathinfo($target_file,PATHINFO_EXTENSION);
echo "imageFileType=".$imageFileType;

// Check if file already exists
if (file_exists($target_file)) {
    echo "Sorry, file already exists.";
    $uploadOk = 0;
}
// Check file size
if ($_FILES["fileToUpload"]["size"] > 500000) {
    echo "Sorry, your file is too large.";
    $uploadOk = 0;
}
// Allow certain file formats
if($imageFileType != "jpg" && $imageFileType != "png"
		&& $imageFileType != "jpeg"
		&& $imageFileType != "gif" ) {
    echo "Sorry, only JPG, JPEG, PNG & GIF files are allowed.";
    $uploadOk = 0;
}
// Check if $uploadOk is set to 0 by an error
if ($uploadOk == 0) {
    echo "Sorry, your file was not uploaded.";
// if everything is ok, try to upload file
} else {
    if (move_uploaded_file($_FILES["fileToUpload"]["tmp_name"],
    								$target_file)) {
        echo "The file ". $_FILES["fileToUpload"]["name"]. " has been uploaded.";
    }
    else {
        echo "Sorry, there was an error uploading your file.";
    }
}
	$id=$_POST['uid'];;
	$uname=$_POST['uname'];
	$address=$_POST['address'];
	$edu=$_POST['edu'];
	$cgpa=$_POST['cgpa'];
	$image = $target_file;
	echo "<br>";
	echo "IMAGE=".$image;
		$query="INSERT INTO personal VALUES ('$id','$uname','$address','$edu','$cgpa','$image')";
        if(mysqli_query($db,$query)){
    	$last_id = mysqli_insert_id($db);
    	echo "New record created successfully".$last_id;
    }
    else
    		 echo "Error: " . $query . "<br>" . mysqli_error($db);
    mysqli_close($db);
?>

ViewAll.php

<?php
    $db = mysqli_connect("localhost","root","","mydb");
    echo "<br>";
    echo "Now displaying all data from the Database";
    echo "<table border=1>";
    $sql= "SELECT * FROM personal";
	$result = mysqli_query($db,$sql);
	 while($row = mysqli_fetch_array($result))
	 {   echo '<tr>
	 	    	<td>
					 <b>'.$row['id'].'</b>
	            </td>
	            <td>
					 <b>'.$row['name'].'</b>
	            </td>
	            <td>
					 <b>'.$row['address'].'</b>
	            </td>
	            <td>
					 <b>'.$row['edu'].'</b>
	            </td>
	            <td>
					 <b>'.$row['cgpa'].'</b>
	            </td>
	            <td>
	               <img name="myimage" src="'.$row['image'].'" width="60" height="60" alt="word" />
	            </td>
	          </tr>';
	    }
echo "</table>";
mysqli_close($db);
?>
