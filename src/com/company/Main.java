package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
    {
        public static ArrayList<Color> Colors = new ArrayList<>();
        public static Scanner intScan = new Scanner(System.in);
        public static Scanner strScan = new Scanner(System.in);

        public static void main(String[] args)
            {
                loadChecker();
                System.out.println("1. RGB Triplet\n2. Hexcode\n3. HTML Color Name");
                switch (intScan.nextInt())
                    {
                        case 1 :
                            RGB();
                        case 2 :
                            Hex();
                        case 3 :
                            HTMLName();
                        default :
                            System.exit(0);//You lose the game... Go away.
                            break;
                        }

            }

        public static void RGB()
            {
                System.out.println("Enter the red value.");
                int r = intScan.nextInt();
                System.out.println("Enter the green value.");
                int g = intScan.nextInt();
                System.out.println("Enter the blue value.");
                int b = intScan.nextInt();
                String check = decimalToHex(r)+decimalToHex(g)+decimalToHex(b);
                for(int i = 0; i < Colors.size(); i++)
                    {
                        if(Colors.get(i).hex.equalsIgnoreCase(check))
                            {
                                System.out.println(Colors.get(i).name);
                            }
                    }
                System.out.println(check);
            }

        public static void Hex()
            {
                System.out.println("Enter a hexcode.");
                String s = strScan.nextLine();
                int r = hexToDecimal(s.substring(0,2));
                int g = hexToDecimal(s.substring(2,4));
                int b = hexToDecimal(s.substring(4,6));
                for(int i = 0; i < Colors.size(); i++)
                    {
                        if(Colors.get(i).hex.equalsIgnoreCase(s))
                            {
                                System.out.println(Colors.get(i).name);
                            }
                    }
                System.out.println(r + " " + g + " " + b);
            }

        public static void HTMLName()
            {
                System.out.println("Enter a HTML color name");
                String s = strScan.nextLine();
                for(int i = 0; i < Colors.size(); i++)
                    {
                        if(Colors.get(i).name.equalsIgnoreCase(s))
                            {
                                System.out.println(Colors.get(i).hex);
                                int r = hexToDecimal(Colors.get(i).name.substring(0,2));
                                int g = hexToDecimal(Colors.get(i).name.substring(2,4));
                                int b = hexToDecimal(Colors.get(i).name.substring(4,6));
                                System.out.println(r + " " + g + " " + b);
                            }
                    }
            }

        public static String decimalToHex(int d)
            {
                String digits = "0123456789ABCDEF";
                if (d <= 0)
                    return "0";
                String hex = "";
                while (d > 0)
                    {
                        int digit = d % 16;
                        hex = digits.charAt(digit) + hex;
                        d = d / 16;
                    }
                return hex;
             }
        public static int hexToDecimal(String s)
            {
                String digits = "0123456789ABCDEF";
                s = s.toUpperCase();
                int value = 0;
                for (int i = 0; i < s.length(); i++)
                    {
                        char c = s.charAt(i);
                        int d = digits.indexOf(c);
                        value = 16*value + d;
                    }
                return value;
            }

        public static void loadChecker()
            {
                Colors.add(new Color( "AliceBlue", "F0F8FF"));
                Colors.add(new Color( "AntiqueWhite", "FAEBD7"));
                Colors.add(new Color( "Aqua", "00FFFF"));
                Colors.add(new Color( "Aquamarine", "7FFFD4"));
                Colors.add(new Color( "Azure", "F0FFFF"));
                Colors.add(new Color( "Beige", "F5F5DC"));
                Colors.add(new Color( "Bisque", "FFE4C4"));
                Colors.add(new Color( "Black", "000000"));
                Colors.add(new Color( "BlanchedAlmond", "FFEBCD"));
                Colors.add(new Color( "Blue", "0000FF"));
                Colors.add(new Color( "BlueViolet", "8A2BE2"));
                Colors.add(new Color( "Brown", "A52A2A"));
                Colors.add(new Color( "BurlyWood", "DEB887"));
                Colors.add(new Color( "CadetBlue", "5F9EA0"));
                Colors.add(new Color( "Chartreuse", "7FFF00"));
                Colors.add(new Color( "Chocolate", "D2691E"));
                Colors.add(new Color( "Coral", "FF7F50"));
                Colors.add(new Color( "CornflowerBlue", "6495ED"));
                Colors.add(new Color( "Cornsilk", "FFF8DC"));
                Colors.add(new Color( "Crimson", "DC143C"));
                Colors.add(new Color( "Cyan", "00FFFF"));
                Colors.add(new Color( "DarkBlue", "00008B"));
                Colors.add(new Color( "DarkCyan", "008B8B"));
                Colors.add(new Color( "DarkGoldenRod", "B8860B"));
                Colors.add(new Color( "DarkGray", "A9A9A9"));
                Colors.add(new Color( "DarkGreen", "006400"));
                Colors.add(new Color( "DarkKhaki", "BDB76B"));
                Colors.add(new Color( "DarkMagenta", "8B008B"));
                Colors.add(new Color( "DarkOliveGreen", "556B2F"));
                Colors.add(new Color( "DarkOrange", "FF8C00"));
                Colors.add(new Color( "DarkOrchid", "9932CC"));
                Colors.add(new Color( "DarkRed", "8B0000"));
                Colors.add(new Color( "DarkSalmon", "E9967A"));
                Colors.add(new Color( "DarkSeaGreen", "8FBC8F"));
                Colors.add(new Color( "DarkSlateBlue", "483D8B"));
                Colors.add(new Color( "DarkSlateGray", "2F4F4F"));
                Colors.add(new Color( "DarkTurquoise", "00CED1"));
                Colors.add(new Color( "DarkViolet", "9400D3"));
                Colors.add(new Color( "DeepPink", "FF1493"));
                Colors.add(new Color( "DeepSkyBlue", "00BFFF"));
                Colors.add(new Color( "DimGray", "696969"));
                Colors.add(new Color( "DodgerBlue", "1E90FF"));
                Colors.add(new Color( "FireBrick", "B22222"));
                Colors.add(new Color( "FloralWhite", "FFFAF0"));
                Colors.add(new Color( "ForestGreen", "228B22"));
                Colors.add(new Color( "Fuschia", "FF00FF"));
                Colors.add(new Color( "Gainsboro", "DCDCDC"));
                Colors.add(new Color( "GhostWhite", "F8F8FF"));
                Colors.add(new Color( "Gold", "FFD700"));
                Colors.add(new Color( "GoldenRod", "DAA520"));
                Colors.add(new Color( "Gray", "808080"));
                Colors.add(new Color( "Green", "008000"));
                Colors.add(new Color( "GreenYellow", "ADFF2F"));
                Colors.add(new Color( "HoneyDew", "F0FFF0"));
                Colors.add(new Color( "HotPink", "FF69B4"));
                Colors.add(new Color( "IndianRed", "CD5C5C"));
                Colors.add(new Color( "Indigo", "4B0082"));
                Colors.add(new Color( "Ivory", "FFFFF0"));
                Colors.add(new Color( "Khaki", "F0E68C"));
                Colors.add(new Color( "Lavender", "E6E6FA"));
                Colors.add(new Color( "LavenderBlush", "FFF0F5"));
                Colors.add(new Color( "LawnGreen", "7CFC00"));
                Colors.add(new Color( "LemonChiffon", "FFFACD"));
                Colors.add(new Color( "LightBlue", "ADD8E6"));
                Colors.add(new Color( "LightCoral", "F08080"));
                Colors.add(new Color( "LightCyan", "E0FFFF"));
                Colors.add(new Color( "LightGoldenRodYellow", "FAFAD2"));
                Colors.add(new Color( "LightGray", "D3D3D3"));
                Colors.add(new Color( "LightGreen", "90EE90"));
                Colors.add(new Color( "LightPink", "FFB6C1"));
                Colors.add(new Color( "LightSalmon", "FFA07A"));
                Colors.add(new Color( "LightSeaGreen", "20B2AA"));
                Colors.add(new Color( "LightSkyBlue", "87CEFA"));
                Colors.add(new Color( "LightSlateGray", "778899"));
                Colors.add(new Color( "LightSteelBlue", "B0C4DE"));
                Colors.add(new Color( "LightYellow", "FFFFE0"));
                Colors.add(new Color( "Lime", "00FF00"));
                Colors.add(new Color( "LimeGreen", "32CD32"));
                Colors.add(new Color( "Linen", "FAF0E6"));
                Colors.add(new Color( "Magenta", "FF00FF"));
                Colors.add(new Color( "Maroon", "800000"));
                Colors.add(new Color( "MediumAquaMarine", "66CDAA"));
                Colors.add(new Color( "MediumBlue", "0000CD"));
                Colors.add(new Color( "MediumOrchid", "BA55D3"));
                Colors.add(new Color( "MediumPurple", "9370DB"));
                Colors.add(new Color( "MediumSeaGreen", "3CB371"));
                Colors.add(new Color( "MediumSlateBlue", "7B68EE"));
                Colors.add(new Color( "MediumSpringGreen", "00FA9A"));
                Colors.add(new Color( "MediumTurquoise", "48D1CC"));
                Colors.add(new Color( "MediumVioletRed", "C71585"));
                Colors.add(new Color( "MidnightBlue", "191970"));
                Colors.add(new Color( "MintCream", "F5FFFA"));
                Colors.add(new Color( "MistyRose", "FFE4E1"));
                Colors.add(new Color( "Moccasin", "FFE4B5"));
                Colors.add(new Color( "NavajoWhite", "FFDEAD"));
                Colors.add(new Color( "Navy", "000080"));
                Colors.add(new Color( "OldLace", "FDF5E6"));
                Colors.add(new Color( "Olive", "808000"));
                Colors.add(new Color( "OliveDrab", "6B8E23"));
                Colors.add(new Color( "Orange", "FFA500"));
                Colors.add(new Color( "OrangeRed", "FF4500"));
                Colors.add(new Color( "Orchid", "DA70D6"));
                Colors.add(new Color( "PaleGoldenRod", "EEE8AA"));
                Colors.add(new Color( "PaleGreen", "98FB98"));
                Colors.add(new Color( "PaleTurquoise", "AFEEEE"));
                Colors.add(new Color( "PaleVioletRed", "DB7093"));
                Colors.add(new Color( "PapayaWhip", "FFEFD5"));
                Colors.add(new Color( "PeachPuff", "FFDAB9"));
                Colors.add(new Color( "Peru", "CD853F"));
                Colors.add(new Color( "Pink", "FFC0CB"));
                Colors.add(new Color( "Plum", "DDA0DD"));
                Colors.add(new Color( "PowderBlue", "B0E0E6"));
                Colors.add(new Color( "Purple", "800080"));
                Colors.add(new Color( "RebeccaPurple", "663399"));
                Colors.add(new Color( "Red", "FF0000"));
                Colors.add(new Color( "RosyBrown", "BC8F8F"));
                Colors.add(new Color( "RoyalBlue", "4169E1"));
                Colors.add(new Color( "SaddleBrown", "8B4513"));
                Colors.add(new Color( "Salmon", "FA8072"));
                Colors.add(new Color( "SandyBrown", "F4A460"));
                Colors.add(new Color( "SeaGreen", "2E8B57"));
                Colors.add(new Color( "SeaShell", "FFF5EE"));
                Colors.add(new Color( "Sienna", "A0522D"));
                Colors.add(new Color( "Silver", "C0C0C0"));
                Colors.add(new Color( "SkyBlue", "87CEEB"));
                Colors.add(new Color( "SlateBlue", "6A5ACD"));
                Colors.add(new Color( "SlateGray", "708090"));
                Colors.add(new Color( "Snow", "FFFAFA"));
                Colors.add(new Color( "SpringGreen", "00FF7F"));
                Colors.add(new Color( "SteelBlue", "4682B4"));
                Colors.add(new Color( "Tan", "D2B48C"));
                Colors.add(new Color( "Teal", "008080"));
                Colors.add(new Color( "Thistle", "D8BFD8"));
                Colors.add(new Color( "Tomato", "FF6347"));
                Colors.add(new Color( "Turquoise", "40E0D0"));
                Colors.add(new Color( "Violet", "EE82EE"));
                Colors.add(new Color( "Wheat", "F5DEB3"));
                Colors.add(new Color( "White", "FFFFFF"));
                Colors.add(new Color( "WhiteSmoke", "F5F5F5"));
                Colors.add(new Color( "Yellow", "FFFF00"));
                Colors.add(new Color( "YellowGreen", "9ACD32"));
            }
    }