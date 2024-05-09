//package adriano;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//@Component
//public class Filter implements jakarta.servlet.Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("<><><><><> FiLtEr fIlTeR <><><><><>");
//        filterChain.doFilter(servletRequest, servletResponse);
//        System.out.println("RESPONSE " + servletResponse.getContentType());
//    }
//}
