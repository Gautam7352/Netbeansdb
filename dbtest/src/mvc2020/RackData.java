package mvc2020;

import java.sql.*;
import java.util.*;

/**
 *
 * @author pallab
 */
public class RackData {

    public String insert(RackBean rb) throws Exception {
        if (rb != null) {
            if (rb.getRackno() <= 0) {
                return "input";
            } else if (rb.getSubject().equals("")) {
                return "input";
            }

            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-M90AMME:1521:XE", "m1", "m1")) {
                PreparedStatement pst = con.prepareStatement("insert into emp1 values(?,?)");
                pst.setInt(1, rb.getRackno());
                pst.setString(2, rb.getSubject());
                pst.executeUpdate();
            }
            return "success";
        } else {
            return "input";
        }
    }

    public String delete(int rackno) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        int x;
        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-M90AMME:1521:XE", "m1", "m1")) {
            PreparedStatement pst = con.prepareStatement("delete from emp1 where no = ?");
            pst.setInt(1, rackno);
            x = pst.executeUpdate();
        }
        if (x > 0) {
            return "success";
        } else {
            return "input";
        }
    }

    public RackBean search(int rackno) throws Exception {
        RackBean r = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-M90AMME:1521:XE", "m1", "m1")) {
            PreparedStatement pst = con.prepareStatement("select * from emp1 where no = ?");
            pst.setInt(1, rackno);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                r = new RackBean();
                r.setRackno(rs.getInt(1));
                r.setSubject(rs.getString(2));

            }
        }
        return r;
    }

    public ArrayList getAll() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        ArrayList al;
        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-M90AMME:1521:XE", "m1", "m1")) {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from emp1 order by 1");
            al = new ArrayList();
            RackBean rb;
            while (rs.next()) {
                rb = new RackBean();
                rb.setRackno(rs.getInt(1));
                rb.setSubject(rs.getString(2));
                al.add(rb);
            }
        }
        return al;
    }

}
