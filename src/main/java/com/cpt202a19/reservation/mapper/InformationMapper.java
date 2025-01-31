package com.cpt202a19.reservation.mapper;

import com.cpt202a19.reservation.entity.Information;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface InformationMapper {
<<<<<<< HEAD

     /** insert detail exaplaination */
     Integer insert(Information information);

     /** Count the number of information created by a user */
     Integer countByUid(Integer uid);
=======
    /** insert detail exaplaination */
    Integer insert(Information information);

    /** Count the number of information created by a user */
    Integer countByUid(Integer uid);
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8

     /** Query a user's list data */
     List<Information> findByUid(Integer uid);

     /** Set all information of a user to non-default */
     Integer updateNonDefaultByUid(Integer uid);
 
     /** Set the specified information as default */
     Integer updateDefaultByRid(
             @Param("rid") Integer rid,
             @Param("modifiedUser") String modifiedUser,
             @Param("modifiedTime") Date modifiedTime);
 
     /** According to the rid, query the information details */
     Information findByRid(Integer rid);
 
     /** delete data by id */
     Integer deleteByRid(Integer rid);
 
     /** Query the last modification of a user */
     Information findLastModified(Integer uid);

<<<<<<< HEAD
}
=======
     /** Update reserve inforamtion by rid */
     Integer updateDetailsByRid(Information information);
}

>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
