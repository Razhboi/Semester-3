/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.booker1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookerGUI {
    private JFrame frame;
    private JTextField titleField, reviewField, ratingField, authorField, publisherField;
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
        
        // Header Label
        JLabel headerLabel = new JLabel("Sistem Manajemen Review Buku");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);

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
        bookTypeBox = new JComboBox<>(new String[]{"Novel", "Cerpen", "Komik"});

        JLabel authorLabel = new JLabel("Penulis:");
        authorField = new JTextField(20);

        JLabel publisherLabel = new JLabel("Penerbit:");
        publisherField = new JTextField(20);

        JButton addButton = new JButton("Tambah Buku");
        JButton deleteButton = new JButton("Hapus Buku");
        JButton displayButton = new JButton("Tampilkan Buku");

        JLabel bookListLabel = new JLabel("Daftar Buku:");
        bookListArea = new JTextArea(15, 40);
        bookListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(bookListArea);

        // Add components to the frame
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2; // Full-width header
        frame.add(headerLabel, gbc);

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1; frame.add(titleLabel, gbc);
        gbc.gridx = 1; frame.add(titleField, gbc);

        gbc.gridx = 0; gbc.gridy = 2; frame.add(genreLabel, gbc);
        gbc.gridx = 1; frame.add(genreBox, gbc);

        gbc.gridx = 0; gbc.gridy = 3; frame.add(reviewLabel, gbc);
        gbc.gridx = 1; frame.add(reviewField, gbc);

        gbc.gridx = 0; gbc.gridy = 4; frame.add(ratingLabel, gbc);
        gbc.gridx = 1; frame.add(ratingField, gbc);

        gbc.gridx = 0; gbc.gridy = 5; frame.add(bookTypeLabel, gbc);
        gbc.gridx = 1; frame.add(bookTypeBox, gbc);

        gbc.gridx = 0; gbc.gridy = 6; frame.add(authorLabel, gbc);
        gbc.gridx = 1; frame.add(authorField, gbc);

        gbc.gridx = 0; gbc.gridy = 7; frame.add(publisherLabel, gbc);
        gbc.gridx = 1; frame.add(publisherField, gbc);

        gbc.gridx = 0; gbc.gridy = 8; frame.add(addButton, gbc);
        gbc.gridx = 1; frame.add(deleteButton, gbc);

        gbc.gridx = 0; gbc.gridy = 9; gbc.gridwidth = 2; frame.add(displayButton, gbc);

        gbc.gridx = 0; gbc.gridy = 10; frame.add(bookListLabel, gbc);
        gbc.gridy = 11; frame.add(scrollPane, gbc);

        // Listeners
        bookTypeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedType = (String) bookTypeBox.getSelectedItem();
                if ("Novel".equals(selectedType) || "Cerpen".equals(selectedType)) {
                    authorField.setEnabled(true);
                    publisherField.setEnabled(true);
                } else {
                    authorField.setEnabled(false);
                    publisherField.setEnabled(false);
                    authorField.setText("");
                    publisherField.setText("");
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

            if (bookType.equals("Novel") || bookType.equals("Cerpen")) {
                String author = authorField.getText();
                String publisher = publisherField.getText();
                Book book = new Novel(title, genre, review, rating, author, publisher);
                bookManager.addBook(book);
                JOptionPane.showMessageDialog(frame, "Buku berhasil ditambahkan!");
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
    }

    public static void main(String[] args) {
        new BookerGUI();
    }
}







