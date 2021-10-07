package servlets;

import Model.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditNote extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String FilePath = getServletContext().getRealPath("/WEB-INF/note.txt");
        String title = "";
        String content = "";
        
        BufferedReader reader = new BufferedReader(new FileReader(new File(FilePath)));

        title = reader.readLine();
        content = reader.readLine();
        
        Note TheNote = new Note(title, content);
        
        if (request.getParameter("edit") == null) {
            request.setAttribute("Note", TheNote);
            reader.close();
            getServletContext().getRequestDispatcher("/WEB-INF/ViewNote.jsp").forward(request, response);
            return;
        } else if (request.getParameter("edit") != null){
            request.setAttribute("Note", TheNote);
            reader.close();
            getServletContext().getRequestDispatcher("/WEB-INF/EditNote.jsp").forward(request, response);
            return;
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String FilePath = getServletContext().getRealPath("/WEB-INF/note.txt");
        String title = "";
        String content = "";
        
        title = request.getParameter("title");
        content = request.getParameter("content");
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FilePath, false))); 
        Note TheNote = new Note(title, content);
        
        request.setAttribute("Note", TheNote);
        writer.println(title);
        writer.println(content);
        writer.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/ViewNote.jsp").forward(request, response);
        return;
        
    }

}
