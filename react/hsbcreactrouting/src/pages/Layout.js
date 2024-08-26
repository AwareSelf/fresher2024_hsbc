import {Link,Outlet} from 'react-router-dom';
function Layout()
{

  /* part 1: Add hyperlink ---mapped to---> route (as below) */
    return(
      <>
       <Link to="/" >Home</Link> <br/><br/>
       <Link to="addemp">Add Emp</Link> <br/><br/>
       <Link to="listemp">List Emp</Link> <br/><br/>

       <hr/>
       <Outlet/>
       </>
         
    );
}
export default Layout;