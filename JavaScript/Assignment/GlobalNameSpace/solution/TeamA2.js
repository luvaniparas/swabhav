<html>
<body>
<script>
   var Tutorix = Tutorix || {};
   Tutorix.TeamA2 = Tutorix.TeamA2 || {};
   Tutorix.TeamA2.student = function (Fname, Mname, Lname){
      this.Fname = Fname;
      this.Mname = Mname;
      this.Lname = Lname;
      this.getFullName = function(){
         return this.Fname + " " + this.Mname + " " + this.Lname;
      }
      return this;
   }
</script>
</body>
</html>