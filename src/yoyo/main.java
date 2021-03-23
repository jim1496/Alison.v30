/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package yoyo;



import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class main {
	
	double ScreenWidthOffSet;
	double ScreenHeightOffSet;
	main ME = this;
	Dimension WindowDimension;
	JFileChooser CSVFileChooser;
	JFrame CSVFrame;
	JButton CSVSelectFileButton;
	JPanel CSVSelectPanel;
	JLabel CSVSelectedFileLBL;
	char DataFieldDelimiter;
	char DataEnclosureDelimiter;
	private boolean isDeBug = true;
	
	public main() {
		
		setScreenWidthOffSet(0.2);
		
		setScreenHeightOffSet(0.1);
		
		setWindowDimension();
		
		setDataFieldDelimiter((char) ascii.cCOM);          // comma ,
		
		setDataEnclosureDelimiter((char) ascii.cDDQ);      // double quotes "
		
		this.CSVFileChooser = new JFileChooser();
		
		this.CSVSelectFileButton = new JButton("Select file to view.");
		
		this.CSVSelectPanel = new JPanel();
		
		this.CSVSelectedFileLBL = new JLabel("No File Selected");
		
		this.CSVFrame = new JFrame("Alison.v30");
		
		this.CSVFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.CSVFrame.setResizable(false);
		
		this.CSVFrame.setPreferredSize(WindowDimension);
		
		this.CSVFrame.setLayout(new BorderLayout());
		
		this.CSVFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		
		this.CSVFileChooser.setFileFilter(new FileNameExtensionFilter("CSV File", "csv"));
		
		this.CSVFileChooser.setMultiSelectionEnabled(false);
		
		this.CSVSelectFileButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (CSVFileChooser.showOpenDialog(CSVFrame) == JFileChooser.APPROVE_OPTION) {
					
					launchData(CSVFileChooser.getSelectedFile());
					
				} else {
					
					CSVSelectedFileLBL.setText("No File Selected");
					
				}
			}
		});
		
		
		CSVSelectPanel.add(CSVSelectFileButton, FlowLayout.LEFT);
		
		CSVSelectPanel.add(CSVSelectedFileLBL, FlowLayout.CENTER);
		
		CSVFrame.getContentPane().add(CSVSelectPanel, BorderLayout.NORTH);
		
		CSVFrame.pack();
		
		CSVFrame.setLocationRelativeTo(null);
		
		CSVFrame.setVisible(true);
		
		CSVSelectedFileLBL.setPreferredSize(new Dimension(220, CSVSelectedFileLBL.getHeight()));
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				main App = new main();
				
			}
			
		});
	}
	
	public JFrame getCSVFrame() {
		
		
		return CSVFrame;
		
	}
	
	public void setCSVSelectedFileLBL(String varText) {
		
		CSVSelectedFileLBL.setText(varText);
		
	}
	
	private void launchData(File dgf) {
		
		setCSVSelectedFileLBL("File: " + dgf.getName());
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				datagrid x = new datagrid(ME, dgf);
				
			}
			
		});
		
	}
	
	private void setWindowDimension() {
		
		int w = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() * this.ScreenWidthOffSet);
		
		int h = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() * this.ScreenHeightOffSet);
		
		this.WindowDimension = new Dimension(w, h);
		
	}
	
	private void setScreenWidthOffSet(double var_width) {
		
		this.ScreenWidthOffSet = var_width;
		
	}
	
	private int getWindowWidth() {
		
		return (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() * this.ScreenWidthOffSet);
		
	}
	
	public double getScreenWidth() {
		
		return Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		
	}
	
	private void setScreenHeightOffSet(double var_height) {
		
		this.ScreenHeightOffSet = var_height;
		
	}
	
	private int getWindowHeight() {
		
		return (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() * this.ScreenHeightOffSet);
		
	}
	
	public double getScreenHeight() {
		
		return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
	}
	
	public char getDataFieldDelimiter() {
		
		return this.DataFieldDelimiter;
		
	}
	
	private void setDataFieldDelimiter(char var_char) {
		
		this.DataFieldDelimiter = var_char;
		
	}
	
	public char getDataEnclosureDelimiter() {
		
		return this.DataEnclosureDelimiter;
		
	}
	
	private void setDataEnclosureDelimiter(char var_char) {
		
		this.DataEnclosureDelimiter = var_char;
		
	}
	
}
/*  -- NOTES --
	--
	--
	--
	--
	--
	--
	--
	--
	--
	--
*/