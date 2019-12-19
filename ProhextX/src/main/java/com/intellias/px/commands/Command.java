package com.intellias.px.commands;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@FunctionalInterface
public interface Command {
    String execute(HttpServletRequest request, HttpServletResponse response);
}
