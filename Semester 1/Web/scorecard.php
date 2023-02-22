<html>
    <head>
        <title>Student score card</title>
    <h1 align='center'>Enter Student Scores</h1>
    </head>
    <body>
        <form action="display.php" method="post" name='scorecard'>
            <table border='3' align='center'>
                <tr>
                    <td>Roll Number :</td>&nbsp;
                    <td><input type="number" name='srollnum' placeholder='Roll number of student' required=""></td>
                </tr>
                <tr>
                    <td>Name :</td>&nbsp;
                    <td><input type="text" name='sname' placeholder='Name of student' required=""></td>
                </tr>
                <tr>
                    <td>Semester :</td>&nbsp;
                    <td><input type="text" name='s_sem' placeholder='Semester' required=""></td>
                </tr>
                <tr>
                    <td>Sub1 :</td>&nbsp;
                    <td><input type="number" name='s1' placeholder='mark of sub1' required=""></td>
                </tr>
                <tr>
                    <td>Sub2 :</td>&nbsp;
                    <td><input type="number" name='s2' placeholder='mark of sub2' required></td>
                </tr>
                <tr>
                    <td>Sub3 :</td>&nbsp;
                    <td><input type="number" name='s3' placeholder='mark of sub3' required></td>
                </tr>
                <tr>
                    <center><td align='center'><input type="submit" value='submit' name="su"></td></center>
                </tr>
            </table>
        </form>
    </body>
</html>

