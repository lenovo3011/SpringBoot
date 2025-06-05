document.addEventListener("DOMContentLoaded", function () {
   const deleteButtons = document.querySelectorAll(".delete-btn");

   deleteButtons.forEach(btn => {
     btn.addEventListener("click", function () {
       const rollno = btn.getAttribute("data-rollno");
       deleteStudent(rollno);
     });
   });
 });






function deleteStudent(rollno) {
	var confirmDelete = confirm("Are you sure want to delete ?") ;
	if (!confirmDelete) {
		alert("Operation Cancelled ! ")
		return ;
	}
	
	var xhr = new XMLHttpRequest () ;
	xhr.open ("DELETE" , "/delete/" + rollno , true ) ;
	
	xhr.onload =  function () {
		if (xhr.status = 200) {
			alert ("Student data deleted ! ") ;
			window.location.reload () ;
				}
		else {alert ("Something went wrong !" + xhr.status)}
	}
	
	xhr.onerror = function () {
		alert ("Check your internet connection ! ");
	}
	
	xhr.send () ;
}