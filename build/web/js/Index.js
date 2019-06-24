function myFunction()
{
    var input, filter, table, tr, td, i, txtvalue;
    input=document.getElementById("myInput");
    filter=input.value.toUpperCase();
    table=document.getElementById("Bank");
    tr=table.getElementsByTagName("tr");
    for(i=0; i<tr.length; i++)
    {
        td=tr[i].getElementsByTagName("td")[0];
        if(td)
        {
            txtvalue=td.textcontext || td.innerText;
            if (txtvalue.toUpperCase().indexOf(filter) > -1) 
            {
                tr[i].style.display = "";
            } 
            else 
            {
                tr[i].style.display = "none";
            }
        }
    }
}