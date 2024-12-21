/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booker1;

/**
 *
 * @author Dell
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookerGUI {
    private JFrame frame;
    private JTextField titleField, reviewField, ratingField, authorField, publisherField, pagesField;
    private JComboBox<String> genreBox, bookTypeBox;
    private JTextArea bookListArea;
    private BookManager bookManager;

    public BookerGUI() {
        bookManager = new BookManager();
        createGUI();
    }

    private void createGUI() {
        // Frame Setup
        frame = new JFrame("Manajemen Buku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Components
        JLabel titleLabel = new JLabel("Judul:");
        titleField = new JTextField(20);

        JLabel genreLabel = new JLabel("Genre:");
        genreBox = new JComboBox<>(new String[]{"Fiksi", "Fantasi", "Sejarah", "Non-Fiksi"});

        JLabel reviewLabel = new JLabel("Review:");
        reviewField = new JTextField(20);

        JLabel ratingLabel = new JLabel("Rating (1-5):");
        ratingField = new JTextField(5);

        JLabel bookTypeLabel = new JLabel("Jenis Buku:");
        bookTypeBox = new JComboBox<>(new String[]{"Novel", "Cerpen"});

        JLabel authorLabel = new JLabel("Penulis (Novel):");
        authorField = new JTextField(20);

        JLabel publisherLabel = new JLabel("Penerbit (Novel):");
        publisherField = new JTextField(20);

        JLabel pagesLabel = new JLabel("Jumlah Halaman (Cerpen):");
        pagesField = new JTextField(10);

        JButton addButton = new JButton("Tambah Buku");
        JButton deleteButton = new JButton("Hapus Buku");
        JButton displayButton = new JButton("Tampilkan Buku");

        JLabel bookListLabel = new JLabel("Daftar Buku:");
        bookListArea = new JTextArea(15, 40);
        bookListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(bookListArea);

        // Add components to the frame
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 0; frame.add(titleLabel, gbc);
        gbc.gridx = 1; frame.add(titleField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; frame.add(genreLabel, gbc);
        gbc.gridx = 1; frame.add(genreBox, gbc);

        gbc.gridx = 0; gbc.gridy = 2; frame.add(reviewLabel, gbc);
        gbc.gridx = 1; frame.add(reviewField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; frame.add(ratingLabel, gbc);
        gbc.gridx = 1; frame.add(ratingField, gbc);

        gbc.gridx = 0; gbc.gridy = 4; frame.add(bookTypeLabel, gbc);
        gbc.gridx = 1; frame.add(bookTypeBox, gbc);

        gbc.gridx = 0; gbc.gridy = 5; frame.add(authorLabel, gbc);
        gbc.gridx = 1; frame.add(authorField, gbc);

        gbc.gridx = 0; gbc.gridy = 6; frame.add(publisherLabel, gbc);
        gbc.gridx = 1; frame.add(publisherField, gbc);

        gbc.gridx = 0; gbc.gridy = 7; frame.add(pagesLabel, gbc);
        gbc.gridx = 1; frame.add(pagesField, gbc);

        gbc.gridx = 0; gbc.gridy = 8; frame.add(addButton, gbc);
        gbc.gridx = 1; frame.add(deleteButton, gbc);

        gbc.gridx = 0; gbc.gridy = 9; gbc.gridwidth = 2; frame.add(displayButton, gbc);

        gbc.gridx = 0; gbc.gridy = 10; frame.add(bookListLabel, gbc);
        gbc.gridy = 11; frame.add(scrollPane, gbc);

        // Set initial visibility
        pagesField.setEnabled(false);

        // Listeners
        bookTypeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedType = (String) bookTypeBox.getSelectedItem();
                if ("Novel".equals(selectedType)) {
                    authorField.setEnabled(true);
                    publisherField.setEnabled(true);
                    pagesField.setEnabled(false);
                    pagesField.setText("");
                } else if ("Cerpen".equals(selectedType)) {
                    authorField.setEnabled(false);
                    publisherField.setEnabled(false);
                    authorField.setText("");
                    publisherField.setText("");
                    pagesField.setEnabled(true);
                }
            }
        });

        addButton.addActionListener(e -> addBook());
        deleteButton.addActionListener(e -> deleteBook());
        displayButton.addActionListener(e -> displayBooks());

        // Visibility
        frame.setVisible(true);
    }

    private void addBook() {
        try {
            String title = titleField.getText();
            String genre = (String) genreBox.getSelectedItem();
            String review = reviewField.getText();
            int rating = Integer.parseInt(ratingField.getText());
            String bookType = (String) bookTypeBox.getSelectedItem();

            if (bookType.equals("Novel")) {
                String author = authorField.getText();
                String publisher = publisherField.getText();
                Novel novel = new Novel(title, genre, review, rating, author, publisher);
                bookManager.addBook(novel);
                JOptionPane.showMessageDialog(frame, "Novel berhasil ditambahkan!");
            } else if (bookType.equals("Cerpen")) {
                int pages = Integer.parseInt(pagesField.getText());
                Cerpen cerpen = new Cerpen(title, genre, review, rating, pages);
                bookManager.addBook(cerpen);
                JOptionPane.showMessageDialog(frame, "Cerpen berhasil ditambahkan!");
            }

            clearFields();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteBook() {
        String title = JOptionPane.showInputDialog(frame, "Masukkan judul buku yang ingin dihapus:");
        bookManager.removeBook(title);
        JOptionPane.showMessageDialog(frame, "Buku berhasil dihapus (jika ada)!");
    }

    private void displayBooks() {
        bookListArea.setText("");
        for (Book book : bookManager.getBooks()) {
            bookListArea.append(book.getDetails() + "\n\n");
        }
    }

    private void clearFields() {
        titleField.setText("");
        reviewField.setText("");
        ratingField.setText("");
        authorField.setText("");
        publisherField.setText("");
        pagesField.setText("");
    }

    public static void main(String[] args) {
        new BookerGUI();
    }
}







