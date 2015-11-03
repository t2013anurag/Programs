<?php
echo "Version".PHP_VERSION;
echo "Config".phpinfo(INFO_CONFIGURATION);
echo "Client Browser".$_SERVER['HTTP__USER_AGENT'];
echo "Client".$_SERVER['REMOTE_ADDR'];
echo "File Name".$_SERVER['PHP_SELF'];
?>
