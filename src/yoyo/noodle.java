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
import java.util.ArrayList;


public class noodle {
	
	
	public noodle(){
		
		//String FEED = "COLUMN_A,COLUMN_B,COLUMN_C,COLUMN_D,COLUMN_E,COLUMN_F,COLUMN_G,COLUMN_H,COLUMN_I,COLUMN_J";
		//String FEED = "COLUMN_A,COLUMN_B,\"COL 23\"\" UMN' _C\",,,COLUMN_D,COLUMN_E,COLUMN_F,COLUMN_G,COLUMN_H,COLUMN_I,COLUMN_J";
		//String FEED = "COLUMN_A,\"COLUMN\"_B\",COLUMN_C,COLUMN_D,\"COLUMN_E\",\"COLUMN_F\",COLUMN_G,COLUMN_H,\"COLUMN_I\",COLUMN_J";
		//String FEED = "2/2/2021,7:08 AM,1,Invoice,33942,0,D06845,JAMES HAAN *CASH*,745.21,GEB,N/A,SPECIAL ORDER #306845,\"HAAN, JAMES\",,HAANJAMES,563,BG,,,29.54,5,,,,\"expose you to wood dust, a\",,,,,,,,,,,,,,,,Description,,,,,,,LC0017642019,,,,0,,,,BGG,H,WINPOS,0,A3B7,0,,,,0,,,,0,0,1/29/2021,,,,,,,,,,,,,,2/2/2021,7:08 AM,,Yes,94510,2,64.18,";
		String FEED = "5/21/2020,6:40 AM,1,Invoice,22193,0,M02931,SERKU CONSTRUCTION *CASH*,\"7,783.74\"\",GEB,\"NORSKE 2\"\" SEC TORX T10\"\"\",,\"CROWE, RUSTY\",,SERKUCONST,563,67,,,50.04,6,,,,\"Drilling,sawing,sanding or\",,,,,,,,,,,,,,,,Description,,,,,,,,,,,0,,,,GEB,X,WINPOS,0,A7B11,0,,,,0,,,,0,0,5/21/2020,,,,,,,,,,,,,,5/21/2020,6:40 AM,,Yes,95949,1,60.5,";
		//String FEED = "Date,Time,St,Type,Cust #,Job,Doc #,Customer Name,Total,Clerk,Units/Per,Reference,Auth. Charge,P.O. #,Short ID,Terminal #,Salesperson,Secondary Salesperson,Ship To #,Trx GP%,Ln#,SKU,Line,Part,Description,Sell QTY,UM,Units,Sell Price,Per,Extension,Code,Line Type,Tax?,Disc %,Pricing Units,Dept,Kit?,Discountable?,Item Code,Item Type,Cost (Prc),Cost (Stk),Item GP%,S/O Vendor,Mfg Part #,IMU Mfg Vendor,Loyalty #,UPS Tracking,BOM Item,Ship Via,Last Updated Terminal,Dir Ship Buyout,From Batch,Order Number,Orig Order Taker,Customer   Codes,Trx's Origin,Version #,Loc,Orig Order Qty,Special Order   PO #,PO Line#,Transfer St,Transfer Doc #,Item User Codes,Item Ship Via,Item Tax Code,List Price,Retail,Item Delivery Date,Part With Core,Core,Sell Codes,Special Fee,Return Reason,IMU Prime Vendor,Pricing Source,Special Instructions 1,Special Instructions 2,Trx Codes,Trx Sales Rep,Item Sales Rep,UPC,Server Date,Server Time,Scanned Image?,Image?,Zip Code,Tax Code,Total Tax,Email Address";
		char DataGridDelimiter = ascii.cCOM;
		char DataGridEnclosure = ascii.cDDQ;
		int IDX = 0;
		int posD = FEED.indexOf(DataGridDelimiter);
		int posE = FEED.indexOf(DataGridEnclosure);
		
		//
		
		//System.out.printf("length: %d | posD: %d | posE: %d\n" , FEED.length() , posD  , posE  );
		ArrayList<String> fieldLineData = new ArrayList<>();
		int counter = 1;
		String tmp = "";
		boolean loopNext = true;
		while(loopNext){
			
			//System.out.printf("[%04d]" , counter);
			
			counter++;
			
			tmp = "";
			
			if( (posE == -1 && posD != -1) || ( posD < posE ) ){
				
				tmp = FEED.substring(IDX, FEED.indexOf(DataGridDelimiter));
				
				FEED = FEED.substring( tmp.length() + 1 );
				
				posD = FEED.indexOf(DataGridDelimiter);
				
				posE = FEED.indexOf(DataGridEnclosure);
				
			} else if( posE == 0 ){
				
				char[] feed = FEED.toCharArray();
				
				for(int x = 0; x < FEED.length(); x++){
					
					if( feed[x] == DataGridEnclosure ){
						
						if( feed[x+1] == DataGridDelimiter ){
							
							tmp = FEED.substring( 1, x );
							
							FEED = FEED.substring( tmp.length() + 3 );
							
							posD = FEED.indexOf(DataGridDelimiter);
							
							posE = FEED.indexOf(DataGridEnclosure);
							
							break;
						}
						
					}
					
				}
			
				
			} else {
				
				tmp = FEED;
				
				loopNext = false;
				
			}
			
			fieldLineData.add(tmp);
			
		}
		
		System.out.printf("\n\n%03d | %s\n" , fieldLineData.size() , fieldLineData);
		
		for(int idx = 0; idx < fieldLineData.size(); idx++ ){
			
			System.out.printf("[%03d] %s\n" , idx , fieldLineData.get(idx)) ;
			
		}

		
	}
	
	
	
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				noodle App = new noodle();
				
			}
			
		});
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