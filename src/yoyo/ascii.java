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



public class ascii {
	
	public static final byte _NUL = 0;   // Null char
	public static final byte _SOH = 1;   // Start of Heading
	public static final byte _STX = 2;   // Start of Text
	public static final byte _ETX = 3;   // End of Text
	public static final byte _EOT = 4;   // End of Transmission
	public static final byte _ENQ = 5;   // Enquiry
	public static final byte _ACK = 6;   // Acknowledgment
	public static final byte _BEL = 7;   // Bell
	public static final byte _BSP = 8;   // Back Space
	public static final byte _HTB = 9;   // Horizontal Tab
	public static final byte _LNF = 10;  // Line Feed
	public static final byte _VTB = 11;  // Vertical Tab
	public static final byte _FMF = 12;  // Form Feed
	public static final byte _CGR = 13;  // Carriage Return
	public static final byte _SHO = 14;  // Shift Out / X-On
	public static final byte _SHI = 15;  // Shift In / X-Off
	public static final byte _DLE = 16;  // Data Line Escape
	public static final byte _DC1 = 17;  // Device Control 1 (oft. XON)
	public static final byte _DC2 = 18;  // Device Control 2
	public static final byte _DC3 = 19;  // Device Control 3 (oft. XOFF)
	public static final byte _DC4 = 20;  // Device Control 4
	public static final byte _NAK = 21;  // Negative Acknowledgement
	public static final byte _SYN = 22;  // Synchronous Idle
	public static final byte _ETB = 23;  // End of Transmit Block
	public static final byte _CNX = 24;  // Cancel
	public static final byte _EMD = 25;  // End of Medium
	public static final byte _SUB = 26;  // Substitute
	public static final byte _ESC = 27;  // Escape
	public static final byte _FSP = 28;  // File Separator
	public static final byte _GSP = 29;  // Group Separator
	public static final byte _RSP = 30;  // Record Separator
	public static final byte _USP = 31;  // Unit Separator
	public static final byte cSPC = 32;  // Space
	public static final byte cEXC = 33;  // Exclamation mark !
	public static final byte cDDQ = 34;  // Double quotes (or speech marks) "
	public static final byte cNUM = 35;  // Number #
	public static final byte cDOL = 36;  // Dollar $
	public static final byte cPCT = 37;  // Per cent sign %
	public static final byte cAMP = 38;  // Ampersand &
	public static final byte cSGQ = 39;  // Single quote '
	public static final byte cOBR = 40;  // Open parenthesis (
	public static final byte cCBR = 41;  // Close parenthesis )
	public static final byte cAST = 42;  // Asterisk *
	public static final byte cPLS = 43;  // Plus +
	public static final byte cCOM = 44;  // Comma ,
	public static final byte cHYP = 45;  // Hyphen -
	public static final byte cDOT = 46;  // Period .
	public static final byte cFSL = 47;  // Forward slash /
	public static final byte c_00 = 48;  // Zero
	public static final byte c_01 = 49;  // One
	public static final byte c_02 = 50;  // Two
	public static final byte c_03 = 51;  // Three
	public static final byte c_04 = 52;  // Four
	public static final byte c_05 = 53;  // Five
	public static final byte c_06 = 54;  // Six
	public static final byte c_07 = 55;  // Seven
	public static final byte c_08 = 56;  // Eight
	public static final byte c_09 = 57;  // Nine
	public static final byte cCOL = 58;  // Colon :
	public static final byte cSCL = 59;  // Semicolon ;
	public static final byte cLTN = 60;  // Less than <
	public static final byte cEQL = 61;  // Equals =
	public static final byte cGTN = 62;  // Greater >
	public static final byte cQUM = 63;  // Question mark ?
	public static final byte cATS = 64;  // At symbol @
	public static final byte c_AA = 65;  // Uppercase A
	public static final byte c_BB = 66;  // Uppercase B
	public static final byte c_CC = 67;  // Uppercase C
	public static final byte c_DD = 68;  // Uppercase D
	public static final byte c_EE = 69;  // Uppercase E
	public static final byte c_FF = 70;  // Uppercase F
	public static final byte c_GG = 71;  // Uppercase G
	public static final byte c_HH = 72;  // Uppercase H
	public static final byte c_II = 73;  // Uppercase I
	public static final byte c_JJ = 74;  // Uppercase J
	public static final byte c_KK = 75;  // Uppercase K
	public static final byte c_LL = 76;  // Uppercase L
	public static final byte c_MM = 77;  // Uppercase M
	public static final byte c_NN = 78;  // Uppercase N
	public static final byte c_OO = 79;  // Uppercase O
	public static final byte c_PP = 80;  // Uppercase P
	public static final byte c_QQ = 81;  // Uppercase Q
	public static final byte c_RR = 82;  // Uppercase R
	public static final byte c_SS = 83;  // Uppercase S
	public static final byte c_TT = 84;  // Uppercase T
	public static final byte c_UU = 85;  // Uppercase U
	public static final byte c_VV = 86;  // Uppercase V
	public static final byte c_WW = 87;  // Uppercase W
	public static final byte c_XX = 88;  // Uppercase X
	public static final byte c_YY = 89;  // Uppercase Y
	public static final byte c_ZZ = 90;  // Uppercase Z
	public static final byte cOBK = 91;  // Opening bracket [
	public static final byte cBSL = 92;  // Backslash \
	public static final byte cCBK = 93;  // Closing bracket ]
	public static final byte cCAR = 94;  // Caret ^
	public static final byte cUDR = 95;  // Underscore _
	public static final byte cGRA = 96;  // Grave accent `
	public static final byte c_Aa = 97;  // Lowercase a
	public static final byte c_Bb = 98;  // Lowercase b
	public static final byte c_Cc = 99;  // Lowercase c
	public static final byte c_Dd = 100; // Lowercase d
	public static final byte c_Ee = 101; // Lowercase e
	public static final byte c_Ff = 102; // Lowercase f
	public static final byte c_Gg = 103; // Lowercase g
	public static final byte c_Hh = 104; // Lowercase h
	public static final byte c_Ii = 105; // Lowercase i
	public static final byte c_Jj = 106; // Lowercase j
	public static final byte c_Kk = 107; // Lowercase k
	public static final byte c_Ll = 108; // Lowercase l
	public static final byte c_Mm = 109; // Lowercase m
	public static final byte c_Nn = 110; // Lowercase n
	public static final byte c_Oo = 111; // Lowercase o
	public static final byte c_Pp = 112; // Lowercase p
	public static final byte c_Qq = 113; // Lowercase q
	public static final byte c_Rr = 114; // Lowercase r
	public static final byte c_Ss = 115; // Lowercase s
	public static final byte c_Tt = 116; // Lowercase t
	public static final byte c_Uu = 117; // Lowercase u
	public static final byte c_Vv = 118; // Lowercase v
	public static final byte c_Ww = 119; // Lowercase w
	public static final byte c_Xx = 120; // Lowercase x
	public static final byte c_Yy = 121; // Lowercase y
	public static final byte c_Zz = 122; // Lowercase z
	public static final byte cOBC = 123; // Opening brace {
	public static final byte cVBR = 124; // Vertical bar |
	public static final byte cCBC = 125; // Closing brace }
	public static final byte cTIL = 126; // Equivalency sign - tilde ~
	public static final byte _DEL = 127; // Delete
	
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