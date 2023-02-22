<html>
    <head>
        <title>Student Registration Form</title>
    </head>
    <script type='text/javascript'>
        function fvalidation()
        {
            if(document.sform.name.value=="")
            {
                alert('This field required');
                document.sform.name.focus();
                return false;
            }
            if(document.sform.gender.value=="")
            {
                alert('This field required');
                document.sform.gender.focus();
                return false;
            }
            if(document.sform.dob.value=="")
            {
                alert('This field required');
                document.sform.dob.focus();
                return false;
            }
            if(document.sform.address.value=="")
            {
                alert('This field required');
                document.sform.address.focus();
                return false;
            }
            if(document.sform.phone.value=="")
            {
                alert('This field required');
                document.sform.phone.focus();
                return false;
            }
            if(document.sform.guardian.value=="")
            {
                alert('This field required');
                document.sform.guardian.focus();
                return false;
            }
            if(document.sform.hobbies.value=="")
            {
                alert('This field required');
                document.sform.hobbies.focus();
                return false;
            }
            if(document.sform.extraca.value=="")
            {
                alert('This field required');
                document.sform.extraca.focus();
                return false;
            }
        }
    </script>
    <body>
    <center>
        <h1>STUDENT REGISTRATION FORM</h1>
        <h2>Fill The Form</h2>
        <form method="post" action="registrationform.php" name="sform" onsubmit="return fvalidation()">
            <table border="1">
                <tr>
                    <th>Name</th>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <th>Gender</th>
                    <td>M<input type="radio" name="gender" value="m">F<input type="radio" name="gender" value="f"></td>
                </tr>
                <tr>
                    <th>DOB</th>
                    <td><input type="date" name="dob"></td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td><input type="textarea" name="address"></td>
                </tr>
                <tr>
                    <th>Phone</th>
                    <td><input type="number" name="phone"></td>
                </tr>
                <tr>
                    <th>Guardian</th>
                    <td><input type="text" name="guardian"></td>
                </tr>
                <tr>
                    <th>Hobbies</th>
                    <td><input type="textarea" name="hobbies"></td>
                </tr>
                <tr>
                    <th>Extra Curricular Activities</th>
                    <td><input type="textarea" name="extraca"></td>
                </tr>
                <tr>
                    <th>Courses</th>
                    <td>
                        <select name="course">
                            <option name="co1">BA</option>
                            <option name="co2">BSC</option>
                            <option name="co3">BCA</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><center><input type="submit" name="sub" value="submit"></center></td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>

