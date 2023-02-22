<?php

$cc = new mysqli("localhost", "root", "", "studentsss_2022");

if ($cc->connect_error) {

    die("Access denied" . $cc->connect_error);
}

$in = "insert into students(ROLL_NO,NAME,sub1,sub2,sub3,sub4) values(4,'sarasu',15,14,13,12),(5,'shantha',15,13,12,14),(6,'ramani',11,13,15,14)";

if ($cc->query($in) === TRUE) {

    echo "New record successfully inserted";
} else {

    echo "Error found" . $cc->error;
}

$cc->close();
?>
