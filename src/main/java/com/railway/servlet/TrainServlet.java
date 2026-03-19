package com.railway.servlet;

import com.railway.model.Train;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class TrainServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Train> trains = new ArrayList<>();

        trains.add(new Train(1, "Express 101", "Hyderabad", "Chennai"));
        trains.add(new Train(2, "Superfast 202", "Delhi", "Mumbai"));
        trains.add(new Train(3, "Intercity 303", "Bangalore", "Mysore"));

        request.setAttribute("trainList", trains);

        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}