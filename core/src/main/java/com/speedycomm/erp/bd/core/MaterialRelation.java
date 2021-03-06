package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 物料关系表
 */
@Entity
@Table(name = "T_BD_MaterialRelation")
public class MaterialRelation extends UnitRelation {

    private static final long serialVersionUID = -8734428729389824488L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FChildID")
    private Material child;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Material parent;

    public Material getChild() {
        return child;
    }

    public void setChild(Material child) {
        this.child = child;
    }

    public Material getParent() {
        return parent;
    }

    public void setParent(Material parent) {
        this.parent = parent;
    }
}
