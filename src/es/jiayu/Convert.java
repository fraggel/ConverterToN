/*
 * Convert.java
 *
 * Created on __DATE__, __TIME__
 */

package es.jiayu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author  __USER__
 */
public class Convert extends javax.swing.JFrame {
	String ROMOriginal = "";
	String modelsBoard[] = null;
	String modeloSeleccionado = "";

	/** Creates new form Convert */
	public Convert() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JSeparator();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Conversor Jiayu 4.1.2 Jelly Bean v0.1.1");
		setLocationByPlatform(true);

		jButton1.setLabel("Seleccionar ROM Original");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { " " }));
		jComboBox1.setEnabled(false);
		jComboBox1.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBox1ItemStateChanged(evt);
			}
		});

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { " " }));
		jComboBox2.setEnabled(false);

		jLabel2.setText("Orignal");

		jLabel3.setText("Convertir en");

		jButton2.setEnabled(false);
		jButton2.setLabel("Crear Parche ZIP");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setEnabled(false);
		jButton3.setLabel("Crear ROM Completa");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("Salir");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jMenu1.setText("Archivo");

		jMenuItem1.setText("Seleccionar ROM Original");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);
		jMenu1.add(jSeparator1);

		jMenuItem2.setText("Salir");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Ayuda");
		jMenu2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu2ActionPerformed(evt);
			}
		});
		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jButton2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										jButton3))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jButton1)
																								.addGap(27,
																										27,
																										27)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jComboBox1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														108,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel2))))
																.addGap(26, 26,
																		26)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel3)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(
																										jButton4)
																								.addComponent(
																										jComboBox2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										108,
																										javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														422, Short.MAX_VALUE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														422, Short.MAX_VALUE))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel4,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										22,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jLabel3))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jComboBox2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1))
								.addGap(33, 33, 33)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton3)
												.addComponent(jButton2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										8, Short.MAX_VALUE)
								.addComponent(jButton4).addGap(22, 22, 22)));

		pack();
	}// </editor-fold>
		//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "EN DESARROLLO");
	}
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			seleccionarROM();
		} catch (Exception e) {
			jLabel4.setText("SE HA PRODUCIDO UN ERROR");
		}

	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel4.setText("PROCESO INICIADO");
		try {
			if (!new File("parcheG3").exists()
					|| !new File("parcheG2").exists()) {
				jLabel4.setText("NO SE HAN ENCONTRADO LOS DIRECTORIOS CON LOS PARCHES");
			} else {
				String strZipFile = ROMOriginal;
				File fSourceZip = new File(strZipFile);
				boolean rom = false;
				/*
				 * STEP 2 : Extract entries while creating required sub-directories
				 */
				ZipFile zipFile = new ZipFile(fSourceZip);
				Enumeration e = zipFile.entries();

				while (e.hasMoreElements()) {
					ZipEntry entry = (ZipEntry) e.nextElement();
					//File destinationFilePath = new File(zipPath, entry.getName());

					// create directories if required.
					//destinationFilePath.getParentFile().mkdirs();

					// if the entry is directory, leave it. Otherwise extract it.
					if (entry.isDirectory()) {
						continue;
					} else {
						//System.out.println("Extracting " + destinationFilePath);

						/*
						 * Get the InputStream for current entry of the zip file using
						 * 
						 * InputStream getInputStream(Entry entry) method.
						 */
						if ("system/build.prop".equals(entry.getName()
								.toLowerCase())) {
							BufferedReader bis = new BufferedReader(
									new InputStreamReader(
											zipFile.getInputStream(entry)));
							rom = true;
							String buildprop = "";
							try {
								String tmp = bis.readLine();
								while (tmp != null) {
									buildprop = buildprop + tmp + "\n";
									tmp = bis.readLine();
								}

								if (buildprop.toLowerCase().indexOf("g2") != -1) {
									modeloSeleccionado = "G2";
									try {
										FileOutputStream fos = new FileOutputStream(
												"parcheG2/system/build.prop");
										BufferedOutputStream bos = new BufferedOutputStream(
												fos, 1024);
										buildprop = buildprop.replaceAll(
												"MT6620", "MT6628");
										buildprop = buildprop.replaceAll(
												"_mt6620", "_mt6628");
										bos.write(buildprop.getBytes());
										// flush the output stream and close it.
										bos.flush();
										bos.close();
										new File("salida").mkdir();
										if (new File(
												"salida/Conversion"
														+ (new File(ROMOriginal)
																.getName()))
												.exists()) {
											new File(
													"salida/Conversion"
															+ (new File(
																	ROMOriginal)
																	.getName()))
													.delete();
										}
										crearZip(
												"salida/Conversion"
														+ (new File(ROMOriginal)
																.getName()),
												new File("parcheG2/"));
										new File("parcheG2/system/build.prop")
												.delete();
									} catch (Exception e2) {
										jLabel4.setText("SE HA PRODUCIDO UN ERROR");
									}
								} else if (buildprop.toLowerCase()
										.indexOf("g3") != -1) {
									modeloSeleccionado = "G3";
									try {
										FileOutputStream fos = new FileOutputStream(
												"parcheG3/system/build.prop");
										BufferedOutputStream bos = new BufferedOutputStream(
												fos, 1024);
										buildprop = buildprop.replaceAll(
												"MT6620", "MT6628");
										buildprop = buildprop.replaceAll(
												"_mt6620", "_mt6628");
										bos.write(buildprop.getBytes());
										// flush the output stream and close it.
										bos.flush();
										bos.close();
										new File("salida").mkdir();
										if (new File(
												"salida/Conversion"
														+ (new File(ROMOriginal)
																.getName()))
												.exists()) {
											new File(
													"salida/Conversion"
															+ (new File(
																	ROMOriginal))
																	.getName())
													.delete();
										}
										crearZip(
												"salida/Conversion"
														+ (new File(ROMOriginal)
																.getName()),
												new File("parcheG3/"));
										new File("parcheG3/system/build.prop")
												.delete();
									} catch (Exception e2) {
										jLabel4.setText("SE HA PRODUCIDO UN ERROR");
									}
								}
								bis.close();
								jLabel4.setText("PROCESO TEMRINADO REVISA LA CARPETA \"SALIDA\"");
								jButton2.setEnabled(false);
								jButton3.setEnabled(false);
							} catch (Exception e2) {
								if (bis != null) {
									bis.close();
								}
								jLabel4.setText("SE HA PRODUCIDO UN ERROR");
							}
						}
					}
				}
				if (!rom) {
					jLabel4.setText("EL FICHERO SELECCIONADO NO ES UNA ROM");
				}
			}

		} catch (Exception e) {
			jLabel4.setText("SE HA PRODUCIDO UN ERROR");
		}
	}

	private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {

		jLabel1.setText((String) jComboBox1.getItemAt(jComboBox1
				.getSelectedIndex()));
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			seleccionarROM();
		} catch (Exception e) {
			jLabel4.setText("SE HA PRODUCIDO UN ERROR");
		}

	}

	private void seleccionarROM() throws ZipException, IOException {
		try {
			//obtenerModelosTodos();
			//generarArrayBoards();
		} catch (Exception e) {
			jLabel4.setText("SE HA PRODUCIDO UN ERROR");
		}

		JFileChooser jfc = new JFileChooser(".");
		jfc.setFileFilter(new ImageFileFilter());
		jfc.setVisible(true);
		jfc.showOpenDialog(getParent());
		
		File selectedFile = jfc.getSelectedFile();
		if (selectedFile != null) {
			jLabel1.setText("Se ha seleccionado la ROM \""
					+ selectedFile.getName() + "\"");
			ROMOriginal = selectedFile.getAbsolutePath();

			jButton2.setEnabled(true);
			jButton3.setEnabled(true);

			if (modeloSeleccionado != null
					&& !"".equals(modeloSeleccionado.trim())) {

			}

		} else {
			jButton2.setEnabled(false);
			jButton3.setEnabled(false);
		}

	}

	private void generarArrayBoards() throws Exception {
		modelsBoard = new String[] { "H928", "H929", "H958" };
		File f = new File("boards.txt");
		BufferedReader d = new BufferedReader(new InputStreamReader(
				new FileInputStream(f)));
		String readLine = d.readLine();
		String[] split = readLine.split(";");
		modelsBoard = split;

	}

	private void obtenerModelosTodos() throws Exception {
		File f = new File("modelos.txt");
		BufferedReader d = new BufferedReader(new InputStreamReader(
				new FileInputStream(f)));
		String readLine = d.readLine();
		String[] split = readLine.split(";");
		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			this.jComboBox1.addItem(string);
		}

	}

	private void obtenerModelosCompatibles(String modeloSeleccionado) {
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Convert().setVisible(true);
			}
		});
	}

	public static List<String> listDirectory(File directory) throws IOException {

		Stack<String> stack = new Stack<String>();
		List<String> list = new ArrayList<String>();

		// If it's a file, just return itself
		if (directory.isFile()) {
			if (directory.canRead())
				list.add(directory.getName());
			return list;
		}

		// Traverse the directory in width-first manner, no-recursively
		String root = directory.getParent();
		stack.push(directory.getName());
		while (!stack.empty()) {
			String current = (String) stack.pop();

			File curDir = new File(root, current);
			String[] fileList = curDir.list();
			if (fileList != null) {
				for (String entry : fileList) {
					File f = new File(curDir, entry);
					if (f.isFile()) {
						if (f.canRead()) {
							list.add(current + File.separator + entry);
						} else {
							System.err.println("File " + f.getPath()
									+ " is unreadable");
							throw new IOException("Can't read file: "
									+ f.getPath());
						}
					} else if (f.isDirectory()) {
						list.add(current + File.separator + entry);
						stack.push(current + File.separator + f.getName());

					} else {
						throw new IOException("Unknown entry: " + f.getPath());
					}
				}
			}
		}
		return list;
	}

	public static void crearZip(String ficheroDest, File srcDir)
			throws Exception {
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream(ficheroDest));
		List<String> fileList = listDirectory(new File(srcDir.getAbsolutePath()
				+ "/META-INF/"));
		List<String> fileList2 = listDirectory(new File(
				srcDir.getAbsolutePath() + "/system/"));
		ZipOutputStream zout = new ZipOutputStream(out);
		zout.setLevel(9);
		zout.setComment("Zipper Fraggel");

		for (String fileName : fileList) {
			File file = new File(new File(srcDir.getAbsolutePath()
					+ "/META-INF/").getParent(), fileName);

			String zipName = fileName;
			if (File.separatorChar != '/')
				zipName = fileName.replace(File.separatorChar, '/');
			ZipEntry ze;
			if (file.isFile()) {
				ze = new ZipEntry(zipName);
				ze.setTime(file.lastModified());
				zout.putNextEntry(ze);
				FileInputStream fin = new FileInputStream(file);
				byte[] buffer = new byte[4096];
				for (int n; (n = fin.read(buffer)) > 0;)
					zout.write(buffer, 0, n);
				fin.close();
			} else {
				ze = new ZipEntry(zipName + '/');
				ze.setTime(file.lastModified());
				zout.putNextEntry(ze);
			}
		}
		for (String fileName : fileList2) {
			File file = new File(
					new File(srcDir.getAbsolutePath() + "/system/").getParent(),
					fileName);

			String zipName = fileName;
			if (File.separatorChar != '/')
				zipName = fileName.replace(File.separatorChar, '/');
			ZipEntry ze;
			if (file.isFile()) {
				ze = new ZipEntry(zipName);
				ze.setTime(file.lastModified());
				zout.putNextEntry(ze);
				FileInputStream fin = new FileInputStream(file);
				byte[] buffer = new byte[4096];
				for (int n; (n = fin.read(buffer)) > 0;)
					zout.write(buffer, 0, n);
				fin.close();
			} else {
				ze = new ZipEntry(zipName + '/');
				ze.setTime(file.lastModified());
				zout.putNextEntry(ze);
			}
		}
		zout.close();
	}

	private static void unZip(String strZipFile) throws Exception {

		File fSourceZip = new File(strZipFile);
		String zipPath = strZipFile.substring(0, strZipFile.length() - 4);
		File temp = new File(zipPath);
		temp.mkdir();

		/*
		 * STEP 2 : Extract entries while creating required sub-directories
		 */
		ZipFile zipFile = new ZipFile(fSourceZip);
		Enumeration e = zipFile.entries();

		while (e.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) e.nextElement();
			File destinationFilePath = new File(zipPath, entry.getName());

			// create directories if required.
			destinationFilePath.getParentFile().mkdirs();

			// if the entry is directory, leave it. Otherwise extract it.
			if (entry.isDirectory()) {
				continue;
			} else {
				System.out.println("Extracting " + destinationFilePath);

				/*
				 * Get the InputStream for current entry of the zip file using
				 * 
				 * InputStream getInputStream(Entry entry) method.
				 */
				BufferedInputStream bis = new BufferedInputStream(
						zipFile.getInputStream(entry));

				int b;
				byte buffer[] = new byte[1024];

				/*
				 * read the current entry from the zip file, extract it and
				 * write the extracted file.
				 */
				FileOutputStream fos = new FileOutputStream(destinationFilePath);
				BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

				while ((b = bis.read(buffer, 0, 1024)) != -1) {
					bos.write(buffer, 0, b);
				}

				// flush the output stream and close it.
				bos.flush();
				bos.close();

				// close the input stream.
				bis.close();
			}
		}

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JSeparator jSeparator1;

	// End of variables declaration//GEN-END:variables
	public class ImageFileFilter extends FileFilter {
		private final String[] okFileExtensions = new String[] { "zip" };
		
		public boolean accept(File file) {
			for (String extension : okFileExtensions) {
				if (file.getName().toLowerCase().endsWith(extension)) {
					return true;
				}else if(file.isDirectory()){
					return true;
				}
			}
			return false;
		}

		@Override
		public String getDescription() {
			return "Archivos *.zip";
		}
	}
}