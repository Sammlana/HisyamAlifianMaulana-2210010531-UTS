import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author HP
 */
public class ResepMasakan extends javax.swing.JFrame {
    private Connection conn;
    private DefaultTableModel tableModel;
    
    public ResepMasakan() {
        initComponents();
        conn = connect();
        tableModel = new DefaultTableModel(
            new String[]{"ID","Nama Resep", "Jenis Hidangan", "Detail"}, 0
        );
        resepTable.setModel(tableModel);
        createTableIfNotExists();
        loadTableData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tambahBtn = new javax.swing.JButton();
        keluarBtn = new javax.swing.JButton();
        importBtn = new javax.swing.JButton();
        ubahBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        exportBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resepArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        resepTable = new javax.swing.JTable();
        cariNamaField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        jenisField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cariBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLIKASI RESEP MAKANAN");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Nama Resep");

        jLabel3.setText("Jenis Hidangan Dari");

        tambahBtn.setBackground(new java.awt.Color(204, 204, 204));
        tambahBtn.setText("Tambah");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        keluarBtn.setBackground(new java.awt.Color(204, 204, 204));
        keluarBtn.setText("Keluar");
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });

        importBtn.setBackground(new java.awt.Color(204, 204, 204));
        importBtn.setText("Import");
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });

        ubahBtn.setBackground(new java.awt.Color(204, 204, 204));
        ubahBtn.setText("Ubah");
        ubahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBtnActionPerformed(evt);
            }
        });

        hapusBtn.setBackground(new java.awt.Color(204, 204, 204));
        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        exportBtn.setText("Export");
        exportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBtnActionPerformed(evt);
            }
        });

        resepArea.setColumns(20);
        resepArea.setRows(5);
        jScrollPane2.setViewportView(resepArea);

        resepTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Resep", "Jenis Makanan"
            }
        ));
        resepTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resepTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resepTable);

        cariNamaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariNamaFieldKeyReleased(evt);
            }
        });

        jLabel4.setText("Cari Nama :");

        jLabel6.setText("Koleksi Resep");

        jLabel7.setText("Tulis Resep");

        cariBtn.setText("Cari");
        cariBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(500, 500, 500))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cariNamaField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cariBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(namaField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jenisField, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tambahBtn)
                                .addGap(8, 8, 8)
                                .addComponent(ubahBtn)
                                .addGap(4, 4, 4)
                                .addComponent(hapusBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(importBtn)))
                        .addGap(2, 2, 2)
                        .addComponent(exportBtn)
                        .addGap(6, 6, 6)
                        .addComponent(keluarBtn)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jenisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambahBtn)
                    .addComponent(ubahBtn)
                    .addComponent(hapusBtn)
                    .addComponent(importBtn)
                    .addComponent(exportBtn)
                    .addComponent(keluarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(cariNamaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Menghubungkan ke SQLite    
    private Connection connect() {
        String url = "jdbc:sqlite:resep.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Koneksi berhasil.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error koneksi database: " + e.getMessage());
        }
        return conn;
    }
    
    //Membuat dan Meverifikasi apakah database dan table sudah ada dan dibuat    
    private void createTableIfNotExists() {
        String sql = "CREATE TABLE IF NOT EXISTS resep ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "nama TEXT NOT NULL, "
                + "jenis TEXT NOT NULL, "
                + "detail TEXT NOT NULL)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error membuat tabel: " + e.getMessage());
        }
    }
    
    //Load tabel database
    private void loadTableData() {
        DefaultTableModel model = (DefaultTableModel) resepTable.getModel();
        model.setRowCount(0); // Bersihkan data tabel

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT id, nama, jenis, detail FROM resep");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String jenis = rs.getString("jenis");
                String detail = rs.getString("detail");

                // Tambahkan baris ke tabel
                model.addRow(new Object[]{id, nama, jenis, detail});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    //Helper untuk export data
    private String getFileExtension(File file) {
        String name = file.getName();
        int lastIndex = name.lastIndexOf('.');
        return (lastIndex == -1) ? "" : name.substring(lastIndex + 1);
    }
    
    //Helper Untuk import data
    private void addResepToDatabase(String nama, String jenis, String detail) {
        String sql = "INSERT INTO resep (nama, jenis, detail) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            stmt.setString(2, jenis);
            stmt.setString(3, detail);
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error menambahkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    //Untuk Menambah data ke JTable
    private void tambahData() {
        String sql = "INSERT INTO resep (nama, jenis, detail) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, namaField.getText());
            stmt.setString(2, jenisField.getText());
            stmt.setString(3, resepArea.getText());
            stmt.executeUpdate();
            loadTableData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error menambah data: " + e.getMessage());
        }
    }

    //Untuk Menghapus data dari JTable
    private void hapusData() {
        int selectedRow = resepTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            String sql = "DELETE FROM resep WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                loadTableData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error menghapus data: " + e.getMessage());
            }
        }
    }

    //Untuk mengubah data dari JTable
    private void updateData() {
        int selectedRow = resepTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            String sql = "UPDATE resep SET nama = ?, jenis = ?, detail = ? WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, namaField.getText());
                stmt.setString(2, jenisField.getText());
                stmt.setString(3, resepArea.getText());
                stmt.setInt(4, id);
                stmt.executeUpdate();
                loadTableData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error mengupdate data: " + e.getMessage());
            }
        }
    }
    
    //Untuk Export ke file .txt
    private void exportToTxt(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                writer.write("Nama: " + tableModel.getValueAt(i, 1) + "\n");
                writer.write("Jenis: " + tableModel.getValueAt(i, 2) + "\n");
                writer.write("Detail: \n" + tableModel.getValueAt(i, 3) + "\n");
                writer.write("--------------------\n");
            }
            JOptionPane.showMessageDialog(this, "Ekspor ke TXT berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error ekspor TXT: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Untuk Export ke file .json
    private void exportToJson(File file) throws JSONException {
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            JSONObject obj = new JSONObject();
            obj.put("nama", tableModel.getValueAt(i, 1));
            obj.put("jenis", tableModel.getValueAt(i, 2));
            obj.put("detail", tableModel.getValueAt(i, 3));
            jsonArray.put(obj);
        }
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(jsonArray.toString(4)); // Indented JSON
            JOptionPane.showMessageDialog(this, "Ekspor ke JSON berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error ekspor JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Untuk Export ke file .pdf
    private void exportToPdf(File file) {
        Document document = new Document(); // Create the document
        try {
            // Initialize PdfWriter and bind it to the file output stream
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open(); // Open the document for writing

            // Add a title to the document
            document.add(new Paragraph("Daftar Resep Makanan\n\n"));

            // Loop through each row in the table model and add the data to the document
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                document.add(new Paragraph("Nama: " + tableModel.getValueAt(i, 1)));
                document.add(new Paragraph("Jenis: " + tableModel.getValueAt(i, 2)));
                document.add(new Paragraph("Detail: " + tableModel.getValueAt(i, 3) + "\n"));
                document.add(new Paragraph("--------------------\n")); // Add a separator
            }

            JOptionPane.showMessageDialog(this, "Ekspor ke PDF berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            // Handle any exceptions that occur
            JOptionPane.showMessageDialog(this, "Error ekspor PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Ensure the document is closed
            if (document.isOpen()) {
                document.close();
            }
        }
    }

    //Untuk Import file .txt
    private void importFromTxt(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String nama = "";
            String jenis = "";
            StringBuilder detailBuilder = new StringBuilder();
            boolean detailStarted = false;

            while ((line = reader.readLine()) != null) {
                // Jika mencapai garis pembatas, simpan data yang terkumpul dan mulai data baru
                if (line.startsWith("--------------------")) {
                    // Simpan data saat ini ke database
                    if (!nama.isEmpty() && !jenis.isEmpty() && detailBuilder.length() > 0) {
                        saveToDatabase(nama, jenis, detailBuilder.toString().trim());
                    }

                    // Reset variabel untuk data berikutnya
                    nama = "";
                    jenis = "";
                    detailBuilder.setLength(0);
                    detailStarted = false;
                    continue;
                }

                // Deteksi bagian Nama dan Jenis
                if (line.startsWith("Nama:")) {
                    nama = line.substring(5).trim();
                    continue;
                }

                if (line.startsWith("Jenis:")) {
                    jenis = line.substring(6).trim();
                    continue;
                }

                // Deteksi awal bagian Detail
                if (line.startsWith("Detail:")) {
                    detailStarted = true;
                    continue; // Lewati baris "Detail:" itu sendiri
                }

                // Tambahkan baris ke detail jika bagian Detail telah dimulai
                if (detailStarted) {
                    detailBuilder.append(line).append("\n");
                }
            }

            // Simpan data terakhir (jika ada) setelah loop selesai
            if (!nama.isEmpty() && !jenis.isEmpty() && detailBuilder.length() > 0) {
                saveToDatabase(nama, jenis, detailBuilder.toString().trim());
            }

            JOptionPane.showMessageDialog(this, "Semua data berhasil diimpor ke database!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadTableData(); // Memperbarui tabel GUI
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal membaca file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void saveToDatabase(String nama, String jenis, String detail) {
        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO resep (nama, jenis, detail) VALUES (?, ?, ?)")) {
            stmt.setString(1, nama);
            stmt.setString(2, jenis);
            stmt.setString(3, detail);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Resep berhasil diimpor ke database!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadTableData();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data ke database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    //Untuk Import file .json
    private void importFromJson(File file) {
        try {
            String content = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
            JSONArray jsonArray = new JSONArray(content);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                String nama = obj.getString("nama");
                String jenis = obj.getString("jenis");
                String detail = obj.getString("detail");
                addResepToDatabase(nama, jenis, detail);
            }
            loadTableData(); // Refresh JTable
            JOptionPane.showMessageDialog(this, "Impor dari JSON berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | JSONException e) {
            JOptionPane.showMessageDialog(this, "Error impor JSON: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Untuk Import file .pdf 
    private void importFromPdf(File file) {
        try {
            PdfReader pdfReader = new PdfReader(file.getAbsolutePath());
            StringBuilder textBuilder = new StringBuilder();

            // Iterasi untuk membaca teks dari setiap halaman
            for (int i = 1; i <= pdfReader.getNumberOfPages(); i++) {
                String pageText = PdfTextExtractor.getTextFromPage(pdfReader, i);
                textBuilder.append(pageText).append("\n");
            }
            pdfReader.close();

            // Memproses teks yang diperoleh
            String text = textBuilder.toString();
            String[] entries = text.split("--------------------");
            for (String entry : entries) {
                String[] lines = entry.split("\n");
                String nama = null, jenis = null, detail = null;

                for (String line : lines) {
                    if (line.startsWith("Nama: ")) {
                        nama = line.substring(6).trim();
                    } else if (line.startsWith("Jenis: ")) {
                        jenis = line.substring(7).trim();
                    } else if (line.startsWith("Detail: ")) {
                        detail = line.substring(8).trim();
                    }
                }

                // Tambahkan data ke database jika semua field valid
                if (nama != null && jenis != null && detail != null) {
                    addResepToDatabase(nama, jenis, detail);
                }
            }

            // Perbarui tampilan JTable
            loadTableData();
            JOptionPane.showMessageDialog(this, "Impor dari PDF berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error impor PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    //Memilih data Table saat di klik
    private void resepTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resepTableMouseClicked
        int selectedRow = resepTable.getSelectedRow();
                if (selectedRow != -1) {
                    namaField.setText(tableModel.getValueAt(selectedRow, 1).toString());
                    jenisField.setText(tableModel.getValueAt(selectedRow, 2).toString());
                    try (PreparedStatement stmt = conn.prepareStatement("SELECT detail FROM resep WHERE id = ?")) {
                        stmt.setInt(1, Integer.parseInt(tableModel.getValueAt(selectedRow, 0).toString()));
                        ResultSet rs = stmt.executeQuery();
                        if (rs.next()) {
                            resepArea.setText(rs.getString("detail"));
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
    }//GEN-LAST:event_resepTableMouseClicked

    //Helper Clear Field
    private void clearFields() {
        namaField.setText("");
        jenisField.setText("");
        resepArea.setText("");
    }

    //Button Tambah
    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        String nama = namaField.getText(); // Nama diambil dari namaField
        String jenis = jenisField.getText(); // Jenis diambil dari jenisField
        String detail = resepArea.getText(); // Detail diambil dari resepArea

        // Validasi input untuk memastikan semua field diisi
        if (nama.isEmpty() || jenis.isEmpty() || detail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Proses penyimpanan ke database
        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO resep (nama, jenis, detail) VALUES (?, ?, ?)")) {
            stmt.setString(1, nama);  // Parameter pertama untuk nama
            stmt.setString(2, jenis); // Parameter kedua untuk jenis
            stmt.setString(3, detail); // Parameter ketiga untuk detail
            stmt.executeUpdate(); // Menyimpan data ke database

            // Menampilkan pesan sukses
            JOptionPane.showMessageDialog(this, "Resep berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Memuat ulang data tabel dan membersihkan field input
            loadTableData();
            clearFields();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tambahBtnActionPerformed

    //Button Ubah
    private void ubahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBtnActionPerformed
        int selectedRow = resepTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diubah!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(tableModel.getValueAt(selectedRow, 0).toString());
        String nama = namaField.getText();
        String jenis = jenisField.getText();
        String detail = resepArea.getText();

        if (nama.isEmpty() || jenis.isEmpty() || detail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (PreparedStatement stmt = conn.prepareStatement("UPDATE resep SET nama = ?, jenis = ?, detail = ? WHERE id = ?")) {
            stmt.setString(1, nama);
            stmt.setString(2, jenis);
            stmt.setString(3, detail);
            stmt.setInt(4, id);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Resep berhasil diperbarui!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadTableData();
            clearFields();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memperbarui data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ubahBtnActionPerformed

    //Button Hapus
    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        int selectedRow = resepTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(tableModel.getValueAt(selectedRow, 0).toString());

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM resep WHERE id = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Resep berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadTableData();
            clearFields();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menghapus data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_hapusBtnActionPerformed

    //Button Keluar Untuk keluar dari aplikasi
    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarBtnActionPerformed

    //Button cari
    private void cariBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBtnActionPerformed
        String keyword = cariNamaField.getText().trim();

        if (keyword.isEmpty()) {
            // Jika field pencarian kosong, tampilkan semua data
            loadTableData();
        } else {
            // Logika pencarian data
            DefaultTableModel model = (DefaultTableModel) resepTable.getModel();
            model.setRowCount(0); // Kosongkan tabel sebelum menambahkan data hasil pencarian

            try (Connection conn = connect();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM resep WHERE nama LIKE ?")) {
                stmt.setString(1, "%" + keyword + "%");
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    String nama = rs.getString("nama");
                    String jenis = rs.getString("jenis");
                    String detail = rs.getString("detail");
                    model.addRow(new Object[]{nama, jenis, detail});
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error pencarian: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cariBtnActionPerformed

    //Button Export
    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String ext = getFileExtension(file);
            switch (ext) {
                case "txt": exportToTxt(file); break;
                case "json": {
                try {
                    exportToJson(file);
                } catch (JSONException ex) {
                    Logger.getLogger(ResepMasakan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
                case "pdf": exportToPdf(file); break;
                default: JOptionPane.showMessageDialog(this, "Format file tidak didukung!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_exportBtnActionPerformed

    //Button Import
    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String ext = getFileExtension(file);

            switch (ext) {
                case "txt":
                    importFromTxt(file.getAbsolutePath());
                    break;
                case "json":
                    importFromJson(file);
                    break;
                case "pdf":
                    importFromPdf(file);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Format file tidak didukung!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_importBtnActionPerformed

    //cariNamaField listener untuk mendeteksi perubahan pada 
    private void cariNamaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariNamaFieldKeyReleased
        String text = cariNamaField.getText().trim();
        if (text.isEmpty()) {
            loadTableData(); // Reset tabel jika pencarian kosong
        }
    }//GEN-LAST:event_cariNamaFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResepMasakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResepMasakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResepMasakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResepMasakan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResepMasakan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariBtn;
    private javax.swing.JTextField cariNamaField;
    private javax.swing.JButton exportBtn;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JButton importBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jenisField;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JTextField namaField;
    private javax.swing.JTextArea resepArea;
    private javax.swing.JTable resepTable;
    private javax.swing.JButton tambahBtn;
    private javax.swing.JButton ubahBtn;
    // End of variables declaration//GEN-END:variables


}
