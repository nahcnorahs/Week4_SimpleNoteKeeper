/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;


/**
 *
 * @author Sharon
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      String noteEdit = request.getParameter("edit");
      String title = "";
      String content = "";
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
       
        try {
            BufferedReader br = new BufferedReader(new FileReader (new File(path)));
        title = br.readLine();
        content = br.readLine();
        br.close();
        
        }
        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        
        Note note = new Note(title,content);
        request.setAttribute("note",note);
       
        if (noteEdit != null){
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request,response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request,response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
                String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        Note note = new Note(title,content);
        request.setAttribute("note",note);
        
        PrintWriter pw = new PrintWriter(new BufferedWriter (new FileWriter(path,false)));
        pw.println(title);
        pw.println(content);
        pw.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request,response);
        
      /*Note note = new Note (title,content);
        request.setAttribute("note", note); --%*/
    }
    
}

  

