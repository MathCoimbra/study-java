<%
    Integer hitsCount = (Integer)application.getAttribute("hitCounter");
    if( hitsCount ==null || hitsCount == 0 ){
       /* First visit */
       out.println("Welcome to my website!");
       hitsCount = 1;
    }else{
       /* return visit */
       out.println("Welcome to my website!");
       hitsCount += 1;
    }
    application.setAttribute("hitCounter", hitsCount);
        
%>
<p>Total number of visits: <%= hitsCount%></p>