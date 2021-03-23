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
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;


public class datagrid extends JFrame {
	
	Dimension DataGridDimension;
	double DataGridScreenWidthOffSet;
	double DataGridScreenHeightOffSet;
	String[] DataGridColumns;
	String[][] DataGridRows;
	String[] DataGridLines;
	File dataFile;
	main parentWnd;
	private boolean isDeBug = true;
	
	public datagrid(main _parent, File data) {
		parentWnd = _parent;
		dataFile = data;
		if (!dataFile.isFile() || !dataFile.exists())
		{
			
			parentWnd.setCSVSelectedFileLBL("File Not Found.");
			
			dispose();
			
		}
		setDataGridScreenWidthOffSet(0.5);
		setDataGridScreenHeightOffSet(0.5);
		setWindowDimension();
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				parentWnd.setCSVSelectedFileLBL("File Successfully Closed.");
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				
				parentWnd.setCSVSelectedFileLBL("File Successfully Closed.");
				
				dispose();
				
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(true);
		setPreferredSize(DataGridDimension);
		setLayout(new BorderLayout());
		try ( BufferedReader _fsBR = new BufferedReader( new FileReader( dataFile ) ) ) {
			
			if( !_fsBR.ready() ){
				
				parentWnd.setCSVSelectedFileLBL("File Not Ready.");
				
				dispose();
			}
			
			Stream str = _fsBR.lines();
			
			int _lines = (int)str.count();
			
			str.close();
			
			DataGridLines = new String[_lines];
			
			System.out.printf("DataGridLines %06d\n",DataGridLines.length);
			
			String _read; int idx = 0;
			
			while ( ( _read = _fsBR.readLine() ) != null){
				
				DataGridLines[idx] = _read;
				
				idx++;
			
			}
			
			_fsBR.close();
			
		} catch(IOException ex) {
			
			ex.printStackTrace();
		
			dispose();
			
		}
		
		String[] DataGridColumns = {"C00" , "C01" , "C02" , "C03" , "C04" , "C05" , "C06" , "C07" , "C08", "C09" , "C10" , "C11" , "C12" , "C13" , "C14" , "C15" , "C16" , "C17" , "C18" , "C19"};
		
		String[][] DataGridTable = new String[500][DataGridColumns.length];
		
		
		for(int x = 0; x < 500; x++){
			
			DataGridTable[x][0]="Hello";
			DataGridTable[x][1]= "r - " + x;
		}
		
		
		JTable _dataTable = new JTable(DataGridTable, DataGridColumns);
		
		_dataTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane _dataScrollPane = new JScrollPane(_dataTable);
		
		add(_dataScrollPane, BorderLayout.CENTER);
		
		
		setTitle(String.format("DataGrid %s - Records: %d" , dataFile.getName() , DataGridLines.length ));
		pack();
		setLocationRelativeTo(parentWnd.getCSVFrame());
		setVisible(true);
		
		
		
	}
	
	private void setWindowDimension() {
		
		int w = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() * this.DataGridScreenWidthOffSet);
		
		int h = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() * this.DataGridScreenHeightOffSet);
		
		this.DataGridDimension = new Dimension(w, h);
		
	}
	
	private void setDataGridScreenWidthOffSet(double var_width) {
		
		this.DataGridScreenWidthOffSet = var_width;
		
	}
	
	private void setDataGridScreenHeightOffSet(double var_height) {
		
		this.DataGridScreenHeightOffSet = var_height;
		
	}
	
	
	
	
	
	private void setDataGridColumns( String _fileRead ){
		
		//try (BufferedReader _fsR = new BufferedReader(new FileReader(_fs))) {}
		
		//DataGridColumns
		
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