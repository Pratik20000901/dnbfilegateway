package com.poc.dnbfilegateway.Service;

import java.util.*;
import java.util.stream.Collectors;
import com.poc.dnbfilegateway.Repository.UserRepository;
import com.poc.dnbfilegateway.Repository.repo_fg_part_grp_memb;
import com.poc.dnbfilegateway.dto.FileDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.poc.dnbfilegateway.Repository.repository_fg_arrivedfile;

@Service
public class arrivedfile_service {

    @Autowired
	private repository_fg_arrivedfile doa;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private repo_fg_part_grp_memb partnercheck;

	public List<FileDetailDTO> findalldetail() {
		List<Object[]> resultObjects = doa.getalldetail();
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findproducerdetail(String prod_org_name) {

		List<Object[]> resultObjects = doa.getproducerdetail(prod_org_name);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findfilenamedetail(String file_name) {

		List<Object[]> resultObjects = doa.getfilenamedetail(file_name);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findstatedetail(String state) {

		List<Object[]> resultObjects = doa.getstatedetail(state);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findproducerandfilenamedetail(String prod_org_name, String file_name) {

		List<Object[]> resultObjects = doa.getproducerandfilenamedetail(prod_org_name, file_name);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findproducerandstatedetail(String prod_org_name, String state) {

		List<Object[]> resultObjects = doa.getproducerandstatedetail(prod_org_name, state);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findfilenameandstatedetail(String file_name, String state) {

		List<Object[]> resultObjects = doa.getfilenameandstatedetail(file_name, state);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}
    
    public List<FileDetailDTO> findproducerandfilenameandstatedetail(String prod_org_name, String file_name, String state) {

		List<Object[]> resultObjects = doa.getproducerandfilenameandstatedetail(prod_org_name, file_name, state);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findconsumerdetail(String mailbox_path) {

		List<Object[]> resultObjects =doa.getconsumerdetail(mailbox_path);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findproducerandconsumerdetail(String prod_org_name, String mailbox_path) {

		List<Object[]> resultObjects = doa.getproducerandconsumerdetail(prod_org_name, mailbox_path);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findconsumerandfilenamedetail(String mailbox_path, String file_name) {

		List<Object[]> resultObjects = doa.getconsumerandfilenamedetail(mailbox_path, file_name);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findconsumerandstatedetail(String mailbox_path, String state) {

		List<Object[]> resultObjects = doa.getconsumerandstatedetail(mailbox_path, state);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findproducerandconsumerandfilenamedetail(String prod_org_name, String mailbox_path, String file_name) {

		List<Object[]> resultObjects = doa.getproducerandconsumerandfilenamedetail(prod_org_name, mailbox_path, file_name);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findproducerandconsumerandstatedetail(String prod_org_name, String mailbox_path, String state) {

		List<Object[]> resultObjects = doa.getproducerandconsumerandstatedetail(prod_org_name, mailbox_path, state);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findconsumerandfilenameandstatedetail(String mailbox_path, String file_name, String state) {

		List<Object[]> resultObjects = doa.getconsumerandfilenameandstatedetail(mailbox_path, file_name, state);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}

	public List<FileDetailDTO> findproducerandconsumerandfilenameandstatedetail(String prod_org_name, String mailbox_path, String file_name, String state) {

		List<Object[]> resultObjects = doa.getproducerandconsumerandfilenameandstatedetail(prod_org_name, mailbox_path, file_name, state);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		List<Object[]> access = partnercheck.getpartners(name);

		if (access != null) {
			return processFileDetails(resultObjects, access);
		} else {
			// User not found
			return Collections.emptyList();
		}
	}


	private List<FileDetailDTO> processFileDetails(List<Object[]> resultObjects, List<Object[]> access) {
		List<FileDetailDTO> fileDetails = new ArrayList<>();

		for (Object[] result : resultObjects) {
			FileDetailDTO fileDetail = new FileDetailDTO();
			fileDetail.setProducer((String) result[0]);
			fileDetail.setStatus((String) result[1]);
			fileDetail.setFileName((String) result[2]);
			fileDetail.setConsumer((String) result[3]);
			fileDetail.setSize(result[4].toString());
			fileDetail.setDateTime(result[5].toString());

			// Check if producer value matches the result of the query
			if (matchesProducer(result[0], access)) {
				fileDetails.add(fileDetail);
			}
		}

		return fileDetails;
	}

	private boolean matchesProducer(Object producer, List<Object[]> access) {
		// Iterate through the results of the query to check if producer matches any entry
		for (Object[] entry : access) {
			if (producer.equals(entry[0])) {
				return true;
			}
		}
		return false;
	}
}
	


