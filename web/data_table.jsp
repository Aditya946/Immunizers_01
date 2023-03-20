<!DOCTYPE html>
<html>
  <head>
    <title>Vaccination Data Entry</title>
    
  </head>
  <style>
    /* Set default font and background color */
body {
  font-family: Arial, sans-serif;
  background-color: #f7f7f7;
}

/* Center the title */
h1 {
  text-align: center;
}

/* Style the form */
form {
  margin: auto;
  max-width: 500px;
  padding: 20px;
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

/* Style the input fields */
label, input[type=text], input[type=number], input[type=date] {
  display: block;
  margin-bottom: 10px;
}

label {
  font-weight: bold;
}

input[type=text], input[type=number], input[type=date] {
  width: 100%;
  padding: 10px;
  border: none;
  border-radius: 5px;
  box-sizing: border-box;
  background-color: #f2f2f2;
}

/* Style the submit button */
input[type=submit] {
  background-color: #4CAF50;
  color: #fff;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  font-weight: bold;
  transition: background-color 0.3s;
}

input[type=submit]:hover {
  background-color: #3e8e41;
}

  </style>
  <body>
    
    <h1>Vaccination Data Entry</h1>
    <form action="PQR" method="post">
      <label for="patient-name">Patient Name:</label>
      <input type="text" id="patient-name" maxlength="10" placeholder="Patient Name" name="patname" required><br>

      <label for="patient-age">Patient Age:</label>
      <input type="number" id="patient-age" placeholder="Patient Age" name="patage" required><br>

      <label for="vaccine-name">Vaccine Name:</label>
      <input type="text" id="vaccine-name"  placeholder="Vaccine Name" ename="vacciname" required><br>

      <label for="vaccination-date">Vaccination Date:</label>
      <input type="date" id="vaccination-date" placeholder="Vaccination Date" name="vaccidate" required><br>

      <label for="vaccination-location">Vaccination Location:</label>
      <input type="text" id="vaccination-location" placeholder="Vaccination Location" name="vaccilocation" required><br>

      <input type="submit" value="Submit">
    </form>
  </body>
</html>