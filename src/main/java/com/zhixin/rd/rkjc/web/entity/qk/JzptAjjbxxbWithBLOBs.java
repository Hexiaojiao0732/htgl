package com.zhixin.rd.rkjc.web.entity.qk;

import java.io.Serializable;

public class JzptAjjbxxbWithBLOBs extends JzptAjjbxxb implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JZPT_AJJBXXB.AQFX
     *
     * @mbggenerated
     */
    private String aqfx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JZPT_AJJBXXB.BANR
     *
     * @mbggenerated
     */
    private String banr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JZPT_AJJBXXB.JYAQ
     *
     * @mbggenerated
     */
    private String jyaq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JZPT_AJJBXXB
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JZPT_AJJBXXB.AQFX
     *
     * @return the value of JZPT_AJJBXXB.AQFX
     *
     * @mbggenerated
     */
    public String getAqfx() {
        return aqfx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JZPT_AJJBXXB.AQFX
     *
     * @param aqfx the value for JZPT_AJJBXXB.AQFX
     *
     * @mbggenerated
     */
    public void setAqfx(String aqfx) {
        this.aqfx = aqfx == null ? null : aqfx.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JZPT_AJJBXXB.BANR
     *
     * @return the value of JZPT_AJJBXXB.BANR
     *
     * @mbggenerated
     */
    public String getBanr() {
        return banr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JZPT_AJJBXXB.BANR
     *
     * @param banr the value for JZPT_AJJBXXB.BANR
     *
     * @mbggenerated
     */
    public void setBanr(String banr) {
        this.banr = banr == null ? null : banr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JZPT_AJJBXXB.JYAQ
     *
     * @return the value of JZPT_AJJBXXB.JYAQ
     *
     * @mbggenerated
     */
    public String getJyaq() {
        return jyaq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JZPT_AJJBXXB.JYAQ
     *
     * @param jyaq the value for JZPT_AJJBXXB.JYAQ
     *
     * @mbggenerated
     */
    public void setJyaq(String jyaq) {
        this.jyaq = jyaq == null ? null : jyaq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JZPT_AJJBXXB
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        JzptAjjbxxbWithBLOBs other = (JzptAjjbxxbWithBLOBs) that;
        return (this.getAjbh() == null ? other.getAjbh() == null : this.getAjbh().equals(other.getAjbh()))
            && (this.getAjblyy() == null ? other.getAjblyy() == null : this.getAjblyy().equals(other.getAjblyy()))
            && (this.getAjcd() == null ? other.getAjcd() == null : this.getAjcd().equals(other.getAjcd()))
            && (this.getAjlb() == null ? other.getAjlb() == null : this.getAjlb().equals(other.getAjlb()))
            && (this.getAjmc() == null ? other.getAjmc() == null : this.getAjmc().equals(other.getAjmc()))
            && (this.getAjsx() == null ? other.getAjsx() == null : this.getAjsx().equals(other.getAjsx()))
            && (this.getAjxxbz() == null ? other.getAjxxbz() == null : this.getAjxxbz().equals(other.getAjxxbz()))
            && (this.getAjxz() == null ? other.getAjxz() == null : this.getAjxz().equals(other.getAjxz()))
            && (this.getAy() == null ? other.getAy() == null : this.getAy().equals(other.getAy()))
            && (this.getBadw() == null ? other.getBadw() == null : this.getBadw().equals(other.getBadw()))
            && (this.getBar() == null ? other.getBar() == null : this.getBar().equals(other.getBar()))
            && (this.getBarlxfs() == null ? other.getBarlxfs() == null : this.getBarlxfs().equals(other.getBarlxfs()))
            && (this.getBarnl() == null ? other.getBarnl() == null : this.getBarnl().equals(other.getBarnl()))
            && (this.getBasj() == null ? other.getBasj() == null : this.getBasj().equals(other.getBasj()))
            && (this.getBlxpsd() == null ? other.getBlxpsd() == null : this.getBlxpsd().equals(other.getBlxpsd()))
            && (this.getCdfs() == null ? other.getCdfs() == null : this.getCdfs().equals(other.getCdfs()))
            && (this.getCljg() == null ? other.getCljg() == null : this.getCljg().equals(other.getCljg()))
            && (this.getCsxxzt() == null ? other.getCsxxzt() == null : this.getCsxxzt().equals(other.getCsxxzt()))
            && (this.getCxdw() == null ? other.getCxdw() == null : this.getCxdw().equals(other.getCxdw()))
            && (this.getCxrq() == null ? other.getCxrq() == null : this.getCxrq().equals(other.getCxrq()))
            && (this.getDbjb() == null ? other.getDbjb() == null : this.getDbjb().equals(other.getDbjb()))
            && (this.getDccl() == null ? other.getDccl() == null : this.getDccl().equals(other.getDccl()))
            && (this.getDjdw() == null ? other.getDjdw() == null : this.getDjdw().equals(other.getDjdw()))
            && (this.getDjr() == null ? other.getDjr() == null : this.getDjr().equals(other.getDjr()))
            && (this.getDjsj() == null ? other.getDjsj() == null : this.getDjsj().equals(other.getDjsj()))
            && (this.getFabe() == null ? other.getFabe() == null : this.getFabe().equals(other.getFabe()))
            && (this.getFabw() == null ? other.getFabw() == null : this.getFabw().equals(other.getFabw()))
            && (this.getFaby() == null ? other.getFaby() == null : this.getFaby().equals(other.getFaby()))
            && (this.getFaddzbm() == null ? other.getFaddzbm() == null : this.getFaddzbm().equals(other.getFaddzbm()))
            && (this.getFadssx() == null ? other.getFadssx() == null : this.getFadssx().equals(other.getFadssx()))
            && (this.getFadxqpcs() == null ? other.getFadxqpcs() == null : this.getFadxqpcs().equals(other.getFadxqpcs()))
            && (this.getFadxz() == null ? other.getFadxz() == null : this.getFadxz().equals(other.getFadxz()))
            && (this.getFady() == null ? other.getFady() == null : this.getFady().equals(other.getFady()))
            && (this.getFasjsx() == null ? other.getFasjsx() == null : this.getFasjsx().equals(other.getFasjsx()))
            && (this.getFasjxx() == null ? other.getFasjxx() == null : this.getFasjxx().equals(other.getFasjxx()))
            && (this.getFhsd() == null ? other.getFhsd() == null : this.getFhsd().equals(other.getFhsd()))
            && (this.getFxsj() == null ? other.getFxsj() == null : this.getFxsj().equals(other.getFxsj()))
            && (this.getFxxs() == null ? other.getFxxs() == null : this.getFxxs().equals(other.getFxxs()))
            && (this.getFyfs() == null ? other.getFyfs() == null : this.getFyfs().equals(other.getFyfs()))
            && (this.getFzasy() == null ? other.getFzasy() == null : this.getFzasy().equals(other.getFzasy()))
            && (this.getGmrs() == null ? other.getGmrs() == null : this.getGmrs().equals(other.getGmrs()))
            && (this.getGxdw() == null ? other.getGxdw() == null : this.getGxdw().equals(other.getGxdw()))
            && (this.getGxfw() == null ? other.getGxfw() == null : this.getGxfw().equals(other.getGxfw()))
            && (this.getJadw() == null ? other.getJadw() == null : this.getJadw().equals(other.getJadw()))
            && (this.getJasj() == null ? other.getJasj() == null : this.getJasj().equals(other.getJasj()))
            && (this.getJbdd() == null ? other.getJbdd() == null : this.getJbdd().equals(other.getJbdd()))
            && (this.getJbdw() == null ? other.getJbdw() == null : this.getJbdw().equals(other.getJbdw()))
            && (this.getJbr() == null ? other.getJbr() == null : this.getJbr().equals(other.getJbr()))
            && (this.getJbsj() == null ? other.getJbsj() == null : this.getJbsj().equals(other.getJbsj()))
            && (this.getJlx() == null ? other.getJlx() == null : this.getJlx().equals(other.getJlx()))
            && (this.getJqbh() == null ? other.getJqbh() == null : this.getJqbh().equals(other.getJqbh()))
            && (this.getJwsq() == null ? other.getJwsq() == null : this.getJwsq().equals(other.getJwsq()))
            && (this.getJzaj() == null ? other.getJzaj() == null : this.getJzaj().equals(other.getJzaj()))
            && (this.getKyyj() == null ? other.getKyyj() == null : this.getKyyj().equals(other.getKyyj()))
            && (this.getLadw() == null ? other.getLadw() == null : this.getLadw().equals(other.getLadw()))
            && (this.getLar() == null ? other.getLar() == null : this.getLar().equals(other.getLar()))
            && (this.getLarq() == null ? other.getLarq() == null : this.getLarq().equals(other.getLarq()))
            && (this.getLyjsjsd() == null ? other.getLyjsjsd() == null : this.getLyjsjsd().equals(other.getLyjsjsd()))
            && (this.getMlph() == null ? other.getMlph() == null : this.getMlph().equals(other.getMlph()))
            && (this.getMlxz() == null ? other.getMlxz() == null : this.getMlxz().equals(other.getMlxz()))
            && (this.getPadw() == null ? other.getPadw() == null : this.getPadw().equals(other.getPadw()))
            && (this.getPagzd() == null ? other.getPagzd() == null : this.getPagzd().equals(other.getPagzd()))
            && (this.getParq() == null ? other.getParq() == null : this.getParq().equals(other.getParq()))
            && (this.getQqsd() == null ? other.getQqsd() == null : this.getQqsd().equals(other.getQqsd()))
            && (this.getQrsd() == null ? other.getQrsd() == null : this.getQrsd().equals(other.getQrsd()))
            && (this.getQtrs() == null ? other.getQtrs() == null : this.getQtrs().equals(other.getQtrs()))
            && (this.getQtsd() == null ? other.getQtsd() == null : this.getQtsd().equals(other.getQtsd()))
            && (this.getQzsd() == null ? other.getQzsd() == null : this.getQzsd().equals(other.getQzsd()))
            && (this.getSajz() == null ? other.getSajz() == null : this.getSajz().equals(other.getSajz()))
            && (this.getSayj() == null ? other.getSayj() == null : this.getSayj().equals(other.getSayj()))
            && (this.getSbbs() == null ? other.getSbbs() == null : this.getSbbs().equals(other.getSbbs()))
            && (this.getSfshse() == null ? other.getSfshse() == null : this.getSfshse().equals(other.getSfshse()))
            && (this.getSfsq() == null ? other.getSfsq() == null : this.getSfsq().equals(other.getSfsq()))
            && (this.getShrs() == null ? other.getShrs() == null : this.getShrs().equals(other.getShrs()))
            && (this.getSldw() == null ? other.getSldw() == null : this.getSldw().equals(other.getSldw()))
            && (this.getSldwlxdh() == null ? other.getSldwlxdh() == null : this.getSldwlxdh().equals(other.getSldwlxdh()))
            && (this.getSlfs() == null ? other.getSlfs() == null : this.getSlfs().equals(other.getSlfs()))
            && (this.getSlr() == null ? other.getSlr() == null : this.getSlr().equals(other.getSlr()))
            && (this.getSlsbpd() == null ? other.getSlsbpd() == null : this.getSlsbpd().equals(other.getSlsbpd()))
            && (this.getSlsj() == null ? other.getSlsj() == null : this.getSlsj().equals(other.getSlsj()))
            && (this.getSpslsj() == null ? other.getSpslsj() == null : this.getSpslsj().equals(other.getSpslsj()))
            && (this.getSpyj() == null ? other.getSpyj() == null : this.getSpyj().equals(other.getSpyj()))
            && (this.getSqjcwh() == null ? other.getSqjcwh() == null : this.getSqjcwh().equals(other.getSqjcwh()))
            && (this.getSszhrmb() == null ? other.getSszhrmb() == null : this.getSszhrmb().equals(other.getSszhrmb()))
            && (this.getSwrs() == null ? other.getSwrs() == null : this.getSwrs().equals(other.getSwrs()))
            && (this.getWhcd() == null ? other.getWhcd() == null : this.getWhcd().equals(other.getWhcd()))
            && (this.getWqtxysaj() == null ? other.getWqtxysaj() == null : this.getWqtxysaj().equals(other.getWqtxysaj()))
            && (this.getWsaj() == null ? other.getWsaj() == null : this.getWsaj().equals(other.getWsaj()))
            && (this.getWzmjsd() == null ? other.getWzmjsd() == null : this.getWzmjsd().equals(other.getWzmjsd()))
            && (this.getXbdw() == null ? other.getXbdw() == null : this.getXbdw().equals(other.getXbdw()))
            && (this.getXbr() == null ? other.getXbr() == null : this.getXbr().equals(other.getXbr()))
            && (this.getXbsj() == null ? other.getXbsj() == null : this.getXbsj().equals(other.getXbsj()))
            && (this.getXpaj() == null ? other.getXpaj() == null : this.getXpaj().equals(other.getXpaj()))
            && (this.getXpbadw() == null ? other.getXpbadw() == null : this.getXpbadw().equals(other.getXpbadw()))
            && (this.getXpbar() == null ? other.getXpbar() == null : this.getXpbar().equals(other.getXpbar()))
            && (this.getXpbasj() == null ? other.getXpbasj() == null : this.getXpbasj().equals(other.getXpbasj()))
            && (this.getXpsldw() == null ? other.getXpsldw() == null : this.getXpsldw().equals(other.getXpsldw()))
            && (this.getXpslr() == null ? other.getXpslr() == null : this.getXpslr().equals(other.getXpslr()))
            && (this.getXpslsj() == null ? other.getXpslsj() == null : this.getXpslsj().equals(other.getXpslsj()))
            && (this.getXxjb() == null ? other.getXxjb() == null : this.getXxjb().equals(other.getXxjb()))
            && (this.getXzajly() == null ? other.getXzajly() == null : this.getXzajly().equals(other.getXzajly()))
            && (this.getXzajzt() == null ? other.getXzajzt() == null : this.getXzajzt().equals(other.getXzajzt()))
            && (this.getXzcs() == null ? other.getXzcs() == null : this.getXzcs().equals(other.getXzcs()))
            && (this.getXzdx() == null ? other.getXzdx() == null : this.getXzdx().equals(other.getXzdx()))
            && (this.getXzfs() == null ? other.getXzfs() == null : this.getXzfs().equals(other.getXzfs()))
            && (this.getXzjarq() == null ? other.getXzjarq() == null : this.getXzjarq().equals(other.getXzjarq()))
            && (this.getXzjd() == null ? other.getXzjd() == null : this.getXzjd().equals(other.getXzjd()))
            && (this.getXzsj() == null ? other.getXzsj() == null : this.getXzsj().equals(other.getXzsj()))
            && (this.getXzwhssjz() == null ? other.getXzwhssjz() == null : this.getXzwhssjz().equals(other.getXzwhssjz()))
            && (this.getXzwp() == null ? other.getXzwp() == null : this.getXzwp().equals(other.getXzwp()))
            && (this.getYbsd() == null ? other.getYbsd() == null : this.getYbsd().equals(other.getYbsd()))
            && (this.getYscbr() == null ? other.getYscbr() == null : this.getYscbr().equals(other.getYscbr()))
            && (this.getYscbrdh() == null ? other.getYscbrdh() == null : this.getYscbrdh().equals(other.getYscbrdh()))
            && (this.getYsdw() == null ? other.getYsdw() == null : this.getYsdw().equals(other.getYsdw()))
            && (this.getYwsawp() == null ? other.getYwsawp() == null : this.getYwsawp().equals(other.getYwsawp()))
            && (this.getZabs() == null ? other.getZabs() == null : this.getZabs().equals(other.getZabs()))
            && (this.getZafw() == null ? other.getZafw() == null : this.getZafw().equals(other.getZafw()))
            && (this.getZagj() == null ? other.getZagj() == null : this.getZagj().equals(other.getZagj()))
            && (this.getZagjxs() == null ? other.getZagjxs() == null : this.getZagjxs().equals(other.getZagjxs()))
            && (this.getZaglbz() == null ? other.getZaglbz() == null : this.getZaglbz().equals(other.getZaglbz()))
            && (this.getZagxxsaj() == null ? other.getZagxxsaj() == null : this.getZagxxsaj().equals(other.getZagxxsaj()))
            && (this.getZars() == null ? other.getZars() == null : this.getZars().equals(other.getZars()))
            && (this.getZasd() == null ? other.getZasd() == null : this.getZasd().equals(other.getZasd()))
            && (this.getZastfs() == null ? other.getZastfs() == null : this.getZastfs().equals(other.getZastfs()))
            && (this.getZatd() == null ? other.getZatd() == null : this.getZatd().equals(other.getZatd()))
            && (this.getZaxwtd() == null ? other.getZaxwtd() == null : this.getZaxwtd().equals(other.getZaxwtd()))
            && (this.getZayy() == null ? other.getZayy() == null : this.getZayy().equals(other.getZayy()))
            && (this.getZazzxs() == null ? other.getZazzxs() == null : this.getZazzxs().equals(other.getZazzxs()))
            && (this.getZjjjss() == null ? other.getZjjjss() == null : this.getZjjjss().equals(other.getZjjjss()))
            && (this.getCszt() == null ? other.getCszt() == null : this.getCszt().equals(other.getCszt()))
            && (this.getAjcxyy() == null ? other.getAjcxyy() == null : this.getAjcxyy().equals(other.getAjcxyy()))
            && (this.getAjfzzt() == null ? other.getAjfzzt() == null : this.getAjfzzt().equals(other.getAjfzzt()))
            && (this.getSlsfsw() == null ? other.getSlsfsw() == null : this.getSlsfsw().equals(other.getSlsfsw()))
            && (this.getAjsjgj() == null ? other.getAjsjgj() == null : this.getAjsjgj().equals(other.getAjsjgj()))
            && (this.getAjysqs() == null ? other.getAjysqs() == null : this.getAjysqs().equals(other.getAjysqs()))
            && (this.getAjysrq() == null ? other.getAjysrq() == null : this.getAjysrq().equals(other.getAjysrq()))
            && (this.getAjfssjd() == null ? other.getAjfssjd() == null : this.getAjfssjd().equals(other.getAjfssjd()))
            && (this.getAjpasjd() == null ? other.getAjpasjd() == null : this.getAjpasjd().equals(other.getAjpasjd()))
            && (this.getAjgjdx() == null ? other.getAjgjdx() == null : this.getAjgjdx().equals(other.getAjgjdx()))
            && (this.getBmjb() == null ? other.getBmjb() == null : this.getBmjb().equals(other.getBmjb()))
            && (this.getAjpafs() == null ? other.getAjpafs() == null : this.getAjpafs().equals(other.getAjpafs()))
            && (this.getSpr() == null ? other.getSpr() == null : this.getSpr().equals(other.getSpr()))
            && (this.getSpdw() == null ? other.getSpdw() == null : this.getSpdw().equals(other.getSpdw()))
            && (this.getSpsj() == null ? other.getSpsj() == null : this.getSpsj().equals(other.getSpsj()))
            && (this.getSpjg() == null ? other.getSpjg() == null : this.getSpjg().equals(other.getSpjg()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getKpqk() == null ? other.getKpqk() == null : this.getKpqk().equals(other.getKpqk()))
            && (this.getSblx() == null ? other.getSblx() == null : this.getSblx().equals(other.getSblx()))
            && (this.getRksj() == null ? other.getRksj() == null : this.getRksj().equals(other.getRksj()))
            && (this.getRsksj() == null ? other.getRsksj() == null : this.getRsksj().equals(other.getRsksj()))
            && (this.getGisX() == null ? other.getGisX() == null : this.getGisX().equals(other.getGisX()))
            && (this.getGisY() == null ? other.getGisY() == null : this.getGisY().equals(other.getGisY()))
            && (this.getStgxsj() == null ? other.getStgxsj() == null : this.getStgxsj().equals(other.getStgxsj()))
            && (this.getScrksj() == null ? other.getScrksj() == null : this.getScrksj().equals(other.getScrksj()))
            && (this.getAqfx() == null ? other.getAqfx() == null : this.getAqfx().equals(other.getAqfx()))
            && (this.getBanr() == null ? other.getBanr() == null : this.getBanr().equals(other.getBanr()))
            && (this.getJyaq() == null ? other.getJyaq() == null : this.getJyaq().equals(other.getJyaq()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JZPT_AJJBXXB
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAjbh() == null) ? 0 : getAjbh().hashCode());
        result = prime * result + ((getAjblyy() == null) ? 0 : getAjblyy().hashCode());
        result = prime * result + ((getAjcd() == null) ? 0 : getAjcd().hashCode());
        result = prime * result + ((getAjlb() == null) ? 0 : getAjlb().hashCode());
        result = prime * result + ((getAjmc() == null) ? 0 : getAjmc().hashCode());
        result = prime * result + ((getAjsx() == null) ? 0 : getAjsx().hashCode());
        result = prime * result + ((getAjxxbz() == null) ? 0 : getAjxxbz().hashCode());
        result = prime * result + ((getAjxz() == null) ? 0 : getAjxz().hashCode());
        result = prime * result + ((getAy() == null) ? 0 : getAy().hashCode());
        result = prime * result + ((getBadw() == null) ? 0 : getBadw().hashCode());
        result = prime * result + ((getBar() == null) ? 0 : getBar().hashCode());
        result = prime * result + ((getBarlxfs() == null) ? 0 : getBarlxfs().hashCode());
        result = prime * result + ((getBarnl() == null) ? 0 : getBarnl().hashCode());
        result = prime * result + ((getBasj() == null) ? 0 : getBasj().hashCode());
        result = prime * result + ((getBlxpsd() == null) ? 0 : getBlxpsd().hashCode());
        result = prime * result + ((getCdfs() == null) ? 0 : getCdfs().hashCode());
        result = prime * result + ((getCljg() == null) ? 0 : getCljg().hashCode());
        result = prime * result + ((getCsxxzt() == null) ? 0 : getCsxxzt().hashCode());
        result = prime * result + ((getCxdw() == null) ? 0 : getCxdw().hashCode());
        result = prime * result + ((getCxrq() == null) ? 0 : getCxrq().hashCode());
        result = prime * result + ((getDbjb() == null) ? 0 : getDbjb().hashCode());
        result = prime * result + ((getDccl() == null) ? 0 : getDccl().hashCode());
        result = prime * result + ((getDjdw() == null) ? 0 : getDjdw().hashCode());
        result = prime * result + ((getDjr() == null) ? 0 : getDjr().hashCode());
        result = prime * result + ((getDjsj() == null) ? 0 : getDjsj().hashCode());
        result = prime * result + ((getFabe() == null) ? 0 : getFabe().hashCode());
        result = prime * result + ((getFabw() == null) ? 0 : getFabw().hashCode());
        result = prime * result + ((getFaby() == null) ? 0 : getFaby().hashCode());
        result = prime * result + ((getFaddzbm() == null) ? 0 : getFaddzbm().hashCode());
        result = prime * result + ((getFadssx() == null) ? 0 : getFadssx().hashCode());
        result = prime * result + ((getFadxqpcs() == null) ? 0 : getFadxqpcs().hashCode());
        result = prime * result + ((getFadxz() == null) ? 0 : getFadxz().hashCode());
        result = prime * result + ((getFady() == null) ? 0 : getFady().hashCode());
        result = prime * result + ((getFasjsx() == null) ? 0 : getFasjsx().hashCode());
        result = prime * result + ((getFasjxx() == null) ? 0 : getFasjxx().hashCode());
        result = prime * result + ((getFhsd() == null) ? 0 : getFhsd().hashCode());
        result = prime * result + ((getFxsj() == null) ? 0 : getFxsj().hashCode());
        result = prime * result + ((getFxxs() == null) ? 0 : getFxxs().hashCode());
        result = prime * result + ((getFyfs() == null) ? 0 : getFyfs().hashCode());
        result = prime * result + ((getFzasy() == null) ? 0 : getFzasy().hashCode());
        result = prime * result + ((getGmrs() == null) ? 0 : getGmrs().hashCode());
        result = prime * result + ((getGxdw() == null) ? 0 : getGxdw().hashCode());
        result = prime * result + ((getGxfw() == null) ? 0 : getGxfw().hashCode());
        result = prime * result + ((getJadw() == null) ? 0 : getJadw().hashCode());
        result = prime * result + ((getJasj() == null) ? 0 : getJasj().hashCode());
        result = prime * result + ((getJbdd() == null) ? 0 : getJbdd().hashCode());
        result = prime * result + ((getJbdw() == null) ? 0 : getJbdw().hashCode());
        result = prime * result + ((getJbr() == null) ? 0 : getJbr().hashCode());
        result = prime * result + ((getJbsj() == null) ? 0 : getJbsj().hashCode());
        result = prime * result + ((getJlx() == null) ? 0 : getJlx().hashCode());
        result = prime * result + ((getJqbh() == null) ? 0 : getJqbh().hashCode());
        result = prime * result + ((getJwsq() == null) ? 0 : getJwsq().hashCode());
        result = prime * result + ((getJzaj() == null) ? 0 : getJzaj().hashCode());
        result = prime * result + ((getKyyj() == null) ? 0 : getKyyj().hashCode());
        result = prime * result + ((getLadw() == null) ? 0 : getLadw().hashCode());
        result = prime * result + ((getLar() == null) ? 0 : getLar().hashCode());
        result = prime * result + ((getLarq() == null) ? 0 : getLarq().hashCode());
        result = prime * result + ((getLyjsjsd() == null) ? 0 : getLyjsjsd().hashCode());
        result = prime * result + ((getMlph() == null) ? 0 : getMlph().hashCode());
        result = prime * result + ((getMlxz() == null) ? 0 : getMlxz().hashCode());
        result = prime * result + ((getPadw() == null) ? 0 : getPadw().hashCode());
        result = prime * result + ((getPagzd() == null) ? 0 : getPagzd().hashCode());
        result = prime * result + ((getParq() == null) ? 0 : getParq().hashCode());
        result = prime * result + ((getQqsd() == null) ? 0 : getQqsd().hashCode());
        result = prime * result + ((getQrsd() == null) ? 0 : getQrsd().hashCode());
        result = prime * result + ((getQtrs() == null) ? 0 : getQtrs().hashCode());
        result = prime * result + ((getQtsd() == null) ? 0 : getQtsd().hashCode());
        result = prime * result + ((getQzsd() == null) ? 0 : getQzsd().hashCode());
        result = prime * result + ((getSajz() == null) ? 0 : getSajz().hashCode());
        result = prime * result + ((getSayj() == null) ? 0 : getSayj().hashCode());
        result = prime * result + ((getSbbs() == null) ? 0 : getSbbs().hashCode());
        result = prime * result + ((getSfshse() == null) ? 0 : getSfshse().hashCode());
        result = prime * result + ((getSfsq() == null) ? 0 : getSfsq().hashCode());
        result = prime * result + ((getShrs() == null) ? 0 : getShrs().hashCode());
        result = prime * result + ((getSldw() == null) ? 0 : getSldw().hashCode());
        result = prime * result + ((getSldwlxdh() == null) ? 0 : getSldwlxdh().hashCode());
        result = prime * result + ((getSlfs() == null) ? 0 : getSlfs().hashCode());
        result = prime * result + ((getSlr() == null) ? 0 : getSlr().hashCode());
        result = prime * result + ((getSlsbpd() == null) ? 0 : getSlsbpd().hashCode());
        result = prime * result + ((getSlsj() == null) ? 0 : getSlsj().hashCode());
        result = prime * result + ((getSpslsj() == null) ? 0 : getSpslsj().hashCode());
        result = prime * result + ((getSpyj() == null) ? 0 : getSpyj().hashCode());
        result = prime * result + ((getSqjcwh() == null) ? 0 : getSqjcwh().hashCode());
        result = prime * result + ((getSszhrmb() == null) ? 0 : getSszhrmb().hashCode());
        result = prime * result + ((getSwrs() == null) ? 0 : getSwrs().hashCode());
        result = prime * result + ((getWhcd() == null) ? 0 : getWhcd().hashCode());
        result = prime * result + ((getWqtxysaj() == null) ? 0 : getWqtxysaj().hashCode());
        result = prime * result + ((getWsaj() == null) ? 0 : getWsaj().hashCode());
        result = prime * result + ((getWzmjsd() == null) ? 0 : getWzmjsd().hashCode());
        result = prime * result + ((getXbdw() == null) ? 0 : getXbdw().hashCode());
        result = prime * result + ((getXbr() == null) ? 0 : getXbr().hashCode());
        result = prime * result + ((getXbsj() == null) ? 0 : getXbsj().hashCode());
        result = prime * result + ((getXpaj() == null) ? 0 : getXpaj().hashCode());
        result = prime * result + ((getXpbadw() == null) ? 0 : getXpbadw().hashCode());
        result = prime * result + ((getXpbar() == null) ? 0 : getXpbar().hashCode());
        result = prime * result + ((getXpbasj() == null) ? 0 : getXpbasj().hashCode());
        result = prime * result + ((getXpsldw() == null) ? 0 : getXpsldw().hashCode());
        result = prime * result + ((getXpslr() == null) ? 0 : getXpslr().hashCode());
        result = prime * result + ((getXpslsj() == null) ? 0 : getXpslsj().hashCode());
        result = prime * result + ((getXxjb() == null) ? 0 : getXxjb().hashCode());
        result = prime * result + ((getXzajly() == null) ? 0 : getXzajly().hashCode());
        result = prime * result + ((getXzajzt() == null) ? 0 : getXzajzt().hashCode());
        result = prime * result + ((getXzcs() == null) ? 0 : getXzcs().hashCode());
        result = prime * result + ((getXzdx() == null) ? 0 : getXzdx().hashCode());
        result = prime * result + ((getXzfs() == null) ? 0 : getXzfs().hashCode());
        result = prime * result + ((getXzjarq() == null) ? 0 : getXzjarq().hashCode());
        result = prime * result + ((getXzjd() == null) ? 0 : getXzjd().hashCode());
        result = prime * result + ((getXzsj() == null) ? 0 : getXzsj().hashCode());
        result = prime * result + ((getXzwhssjz() == null) ? 0 : getXzwhssjz().hashCode());
        result = prime * result + ((getXzwp() == null) ? 0 : getXzwp().hashCode());
        result = prime * result + ((getYbsd() == null) ? 0 : getYbsd().hashCode());
        result = prime * result + ((getYscbr() == null) ? 0 : getYscbr().hashCode());
        result = prime * result + ((getYscbrdh() == null) ? 0 : getYscbrdh().hashCode());
        result = prime * result + ((getYsdw() == null) ? 0 : getYsdw().hashCode());
        result = prime * result + ((getYwsawp() == null) ? 0 : getYwsawp().hashCode());
        result = prime * result + ((getZabs() == null) ? 0 : getZabs().hashCode());
        result = prime * result + ((getZafw() == null) ? 0 : getZafw().hashCode());
        result = prime * result + ((getZagj() == null) ? 0 : getZagj().hashCode());
        result = prime * result + ((getZagjxs() == null) ? 0 : getZagjxs().hashCode());
        result = prime * result + ((getZaglbz() == null) ? 0 : getZaglbz().hashCode());
        result = prime * result + ((getZagxxsaj() == null) ? 0 : getZagxxsaj().hashCode());
        result = prime * result + ((getZars() == null) ? 0 : getZars().hashCode());
        result = prime * result + ((getZasd() == null) ? 0 : getZasd().hashCode());
        result = prime * result + ((getZastfs() == null) ? 0 : getZastfs().hashCode());
        result = prime * result + ((getZatd() == null) ? 0 : getZatd().hashCode());
        result = prime * result + ((getZaxwtd() == null) ? 0 : getZaxwtd().hashCode());
        result = prime * result + ((getZayy() == null) ? 0 : getZayy().hashCode());
        result = prime * result + ((getZazzxs() == null) ? 0 : getZazzxs().hashCode());
        result = prime * result + ((getZjjjss() == null) ? 0 : getZjjjss().hashCode());
        result = prime * result + ((getCszt() == null) ? 0 : getCszt().hashCode());
        result = prime * result + ((getAjcxyy() == null) ? 0 : getAjcxyy().hashCode());
        result = prime * result + ((getAjfzzt() == null) ? 0 : getAjfzzt().hashCode());
        result = prime * result + ((getSlsfsw() == null) ? 0 : getSlsfsw().hashCode());
        result = prime * result + ((getAjsjgj() == null) ? 0 : getAjsjgj().hashCode());
        result = prime * result + ((getAjysqs() == null) ? 0 : getAjysqs().hashCode());
        result = prime * result + ((getAjysrq() == null) ? 0 : getAjysrq().hashCode());
        result = prime * result + ((getAjfssjd() == null) ? 0 : getAjfssjd().hashCode());
        result = prime * result + ((getAjpasjd() == null) ? 0 : getAjpasjd().hashCode());
        result = prime * result + ((getAjgjdx() == null) ? 0 : getAjgjdx().hashCode());
        result = prime * result + ((getBmjb() == null) ? 0 : getBmjb().hashCode());
        result = prime * result + ((getAjpafs() == null) ? 0 : getAjpafs().hashCode());
        result = prime * result + ((getSpr() == null) ? 0 : getSpr().hashCode());
        result = prime * result + ((getSpdw() == null) ? 0 : getSpdw().hashCode());
        result = prime * result + ((getSpsj() == null) ? 0 : getSpsj().hashCode());
        result = prime * result + ((getSpjg() == null) ? 0 : getSpjg().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getKpqk() == null) ? 0 : getKpqk().hashCode());
        result = prime * result + ((getSblx() == null) ? 0 : getSblx().hashCode());
        result = prime * result + ((getRksj() == null) ? 0 : getRksj().hashCode());
        result = prime * result + ((getRsksj() == null) ? 0 : getRsksj().hashCode());
        result = prime * result + ((getGisX() == null) ? 0 : getGisX().hashCode());
        result = prime * result + ((getGisY() == null) ? 0 : getGisY().hashCode());
        result = prime * result + ((getStgxsj() == null) ? 0 : getStgxsj().hashCode());
        result = prime * result + ((getScrksj() == null) ? 0 : getScrksj().hashCode());
        result = prime * result + ((getAqfx() == null) ? 0 : getAqfx().hashCode());
        result = prime * result + ((getBanr() == null) ? 0 : getBanr().hashCode());
        result = prime * result + ((getJyaq() == null) ? 0 : getJyaq().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JZPT_AJJBXXB
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aqfx=").append(aqfx);
        sb.append(", banr=").append(banr);
        sb.append(", jyaq=").append(jyaq);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}