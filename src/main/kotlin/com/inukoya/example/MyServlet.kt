package com.inukoya.example

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class MyServlet : HttpServlet() {

    public override fun doGet(req: HttpServletRequest, res: HttpServletResponse) {
        res.contentType = "text/plain"
        res.writer.println("Please use the form to POST to this url")
    }

    public override fun doPost(req: HttpServletRequest, res: HttpServletResponse) {
        val name = req.getParameter("name")
        res.contentType = "text/plain"
        if (name == null) {
            res.writer.println("Please enter a name")
        }
        res.writer.println("Hello " + name!!)
    }
}
