/*
 * Copyright (c) Sematext Group, Inc.
 * All Rights Reserved
 *
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF Sematext Group, Inc.
 * The copyright notice above does not evidence any
 * actual or intended publication of such source code.
 *
 */

package prog8;

import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class JooqTestServlet extends HttpServlet {
  @Override public void init() throws ServletException {
    System.err.println("Initializing JOOQ");
    DefaultDSLContext ctx = new DefaultDSLContext(SQLDialect.DEFAULT);
    System.err.println("JOOQ test successful");
    System.err.println(ctx);
  }
}
