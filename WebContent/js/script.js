function validateMenuItem()
{
                
                var title=document.forms["editMenuForm"]["mname"].value;
                var price=document.forms["editMenuForm"]["price"].value;
                var dol=document.forms["editMenuForm"]["launch"].value;
                var cate=document.forms["editMenuForm"]["category"].value;
                alert("invalidate forms");
                if(title== "")
                { 
                alert("title is required");
                return false;
                }
               else if(title.length<2 || title.length>65)
                {
                alert("tile should have 2 to 65 characters");
                return false;
                }
                else if(price == "")
                {
                alert("price is required"); 
                return false;
                }
                else if(isNaN(price))
                {
                alert("Price has to be number");
                return false;
                }
                else if(dol == "")
                {
                alert("Date of launch is empty");
                return false;
                }
                else if(cate == "empty")
                {
                alert("category is empty");
                return false;
                }
                
}