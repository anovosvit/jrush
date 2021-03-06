package com.javarush.task.task32.task3209.actions;

import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        view.redo();
    }

    private View view;

    public RedoAction(View view) {
        this.view = view;
    }
}
