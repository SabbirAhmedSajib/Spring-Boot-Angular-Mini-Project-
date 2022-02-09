package com.LockerService.Locker.Service.Management.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "LSDRWRREL"
)
public class LSDRWRRELEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long RELID;
    private String OPRBRANCD;
    private long CUSCOD;
    @Size(max = 3, min = 3)
    @NotNull
    private String BRANCD;
    @NotEmpty
    private String ACTYPE;
    private String OPRSTAMP;
    private Date OPRTIMSTAMP;
    private String UPDATE_BY;
    private Date UPDATE_DATE;
    private String APPFLG;
    private String APPSTAMP;
    private Date APPTIMSTAMP;
    private long LCKRID;
    private long DRWRID;
    private String ACTNUM;
    private Date RELDATE;
    private String PAYSTAT;
    private String REMARKS;
    private long DUEAMT;

}
