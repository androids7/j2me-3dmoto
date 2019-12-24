/*
 * Copyright (C) 2012 Thinh Pham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.openitvn.game.bound;

/**
 *
 * @author Thinh Pham
 */
public class Point {
    public int x, y;
    
    public Point() {
        x = y = 0;
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point minus(Point p1, Point p2) {
        return new Point(p1.x - p2.x, p1.y - p2.y);
    }
    
    public static Point add(Point p1, Point p2) {
        return new Point(p1.x + p2.x, p1.y + p2.y);
    }
}
