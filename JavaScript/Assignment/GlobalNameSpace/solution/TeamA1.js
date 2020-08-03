<html>
<body>
<script>
   var Tutorix = Tutorix || {};
   Tutorix.TeamA1 = Tutorix.TeamA1 || {};
   Tutorix.TeamA1.student = function (Fname, Lname){
      this.Fname = Fname;
      this.Lname = Lname;
      this.getFullName = function(){
         return this.Fname + " " + this.Lname;
      }
      return this;
   }
</script>
</body>
</html>