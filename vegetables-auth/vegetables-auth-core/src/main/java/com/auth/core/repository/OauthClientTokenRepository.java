
package com.auth.core.repository;

import com.auth.base.BaseRepository;
import com.auth.core.entity.OauthClientToken;
import org.springframework.stereotype.Repository;


/**
 * @author automatic
 * @version 1.0
 * @data 2019-05-23 15:57
 **/

@Repository
public interface OauthClientTokenRepository extends BaseRepository<OauthClientToken, String> {


}
